package com.dungnt.remote_healthcare;

import com.dungnt.remote_healthcare.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class RemoteHealthcareApplication implements CommandLineRunner {
    @Autowired
    UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(RemoteHealthcareApplication.class, args);
    }

    @Override
    public void run(String... args) {

    }
}