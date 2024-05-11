package com.dungnt.remote_healthcare.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Field;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponse {
    ObjectId _id;
    String fullName;
    String email;
    String password;
    @Field("mobile")
    String phoneNumber;
    Integer role;
    String address;
    Boolean isBlocked;
    String refreshToken;
}
