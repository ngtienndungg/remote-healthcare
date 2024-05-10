package com.dungnt.remote_healthcare.models;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@Document(collection = "users")
public class User {
    @Id
    private ObjectId _id;
    private String fullName;
    private String email;
    private String password;
    @Field("mobile")
    private String phoneNumber;
    private Integer role;
    private String address;
    private boolean isBlocked;
    private Date createdAt;
    private Date updatedAt;
    private String refreshToken;
}
