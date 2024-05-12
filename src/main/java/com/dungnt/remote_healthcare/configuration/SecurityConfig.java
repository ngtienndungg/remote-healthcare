package com.dungnt.remote_healthcare.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.oauth2.jose.jws.MacAlgorithm;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
import org.springframework.security.web.SecurityFilterChain;

import javax.crypto.spec.SecretKeySpec;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    private static final String SIGNER_KEY = "8uhpkp6t4w1l7j59hh6t2f5b95hvlr76";
    private final String[] PUBLIC_ENDPOINTS = {
            "/auth/introspect"
    };
    private final String[] ADMIN_ENDPOINTS = {
            "/appointment",
            "/user"
    };

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests(request -> {
                    request.requestMatchers(HttpMethod.POST, PUBLIC_ENDPOINTS).permitAll()
                            .requestMatchers(HttpMethod.GET, ADMIN_ENDPOINTS).hasAuthority("ROLE_ADMIN")
                            .anyRequest().authenticated();
                }
        );
        httpSecurity.oauth2ResourceServer(oauth2 -> {
            oauth2.jwt(jwtConfigurer -> {
                jwtConfigurer.decoder(jwtDecoder())
                        .jwtAuthenticationConverter(jwtAuthenticationConverter());
            });
        });
        httpSecurity.csrf(AbstractHttpConfigurer::disable);
        return httpSecurity.build();
    }

    @Bean
    public JwtDecoder jwtDecoder() {
        SecretKeySpec secretKeySpec = new SecretKeySpec(SIGNER_KEY.getBytes(), "HS256");
        return NimbusJwtDecoder.
                withSecretKey(secretKeySpec).
                macAlgorithm(MacAlgorithm.HS256).
                build();
    }

    @Bean
    public JwtAuthenticationConverter jwtAuthenticationConverter() {
        JwtAuthenticationConverter converter = new JwtAuthenticationConverter();
        converter.setJwtGrantedAuthoritiesConverter(jwt -> {
            String role = jwt.getClaimAsString("role");
            return switch (role) {
                case "1" -> AuthorityUtils.createAuthorityList("ROLE_ADMIN");
                case "2" -> AuthorityUtils.createAuthorityList("ROLE_CLINIC");
                case "3" -> AuthorityUtils.createAuthorityList("ROLE_DOCTOR");
                case "4" -> AuthorityUtils.createAuthorityList("ROLE_USER");
                default -> AuthorityUtils.createAuthorityList();
            };
        });
        return converter;
    }
}
