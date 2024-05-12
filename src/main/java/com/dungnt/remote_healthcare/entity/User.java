package com.dungnt.remote_healthcare.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Document(collection = "users")
public class User {
    @Id
    String _id;
    String fullName;
    String email;
    String password;
    String mobile;
    Integer role;
    String address;
    Boolean isBlocked;
    Date createdAt;
    Date updatedAt;
    String refreshToken;
}
