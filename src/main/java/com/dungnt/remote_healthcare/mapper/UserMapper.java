package com.dungnt.remote_healthcare.mapper;

import com.dungnt.remote_healthcare.dto.response.UserResponse;
import com.dungnt.remote_healthcare.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "password", ignore = true)
    UserResponse toUserResponse(User user);

    List<UserResponse> toUserResponses(List<User> users);
}
