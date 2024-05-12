package com.dungnt.remote_healthcare.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponse {
    String _id;
    String fullName;
    String email;
    String password;
    String mobile;
    Integer role;
    String address;
    Boolean isBlocked;
    String refreshToken;
}
