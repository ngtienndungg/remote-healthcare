package com.dungnt.remote_healthcare.entity;

import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Document(collection = "users")
public class User {
    @Id
    ObjectId _id;
    String fullName;
    String email;
    @Size(min = 6, message = "INSECURE_PASSWORD")
    String password;
    @Field("mobile")
    String phoneNumber;
    Integer role;
    String address;
    Boolean isBlocked;
    Date createdAt;
    Date updatedAt;
    String refreshToken;
}
