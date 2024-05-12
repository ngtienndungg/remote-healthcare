package com.dungnt.remote_healthcare.service;

import com.dungnt.remote_healthcare.dto.request.IntrospectRequest;
import com.dungnt.remote_healthcare.dto.response.IntrospectResponse;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSVerifier;
import com.nimbusds.jose.crypto.MACVerifier;
import com.nimbusds.jwt.SignedJWT;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Date;

@Service
public class AuthenticationService {

    private static final String SIGNER_KEY = "8uhpkp6t4w1l7j59hh6t2f5b95hvlr76";

    public IntrospectResponse introspect(IntrospectRequest request) throws ParseException, JOSEException {
        String accessToken = request.getAccessToken();
        JWSVerifier jwsVerifier = new MACVerifier(SIGNER_KEY.getBytes());
        SignedJWT signedJWT = SignedJWT.parse(accessToken);
        Date expiredTime = signedJWT.getJWTClaimsSet().getExpirationTime();
        boolean isVerified = signedJWT.verify(jwsVerifier);
        IntrospectResponse introspectResponse = new IntrospectResponse();
        introspectResponse.setValid(isVerified && expiredTime.after(new Date()));
        return introspectResponse;
    }
}
