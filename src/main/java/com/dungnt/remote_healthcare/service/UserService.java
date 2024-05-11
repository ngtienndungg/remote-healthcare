package com.dungnt.remote_healthcare.service;

import com.dungnt.remote_healthcare.dto.response.UserResponse;
import com.dungnt.remote_healthcare.entity.User;
import com.dungnt.remote_healthcare.mapper.UserMapper;
import com.dungnt.remote_healthcare.repository.UserRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserService {

    UserRepository userRepository;
    UserMapper userMapper;

    public List<UserResponse> getUsers() {
        List<User> users = userRepository.findAll();
        return userMapper.toUserResponses(users);
    }

    public UserResponse getUserById(ObjectId _id) {
        User user = userRepository.findBy_id(_id);
        return userMapper.toUserResponse(user);
    }
}
