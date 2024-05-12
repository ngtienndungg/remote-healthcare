package com.dungnt.remote_healthcare.controller;

import com.dungnt.remote_healthcare.dto.request.ApiResponse;
import com.dungnt.remote_healthcare.dto.response.UserResponse;
import com.dungnt.remote_healthcare.service.UserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequestMapping("/user")
public class UserController {

    UserService userService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ApiResponse<UserResponse> getUserById(@PathVariable("id") String id) {
        ApiResponse<UserResponse> response = new ApiResponse<>();
        response.setResult(userService.getUserById(id));
        return response;
    }

    @GetMapping
    public ApiResponse<List<UserResponse>> getUsers() {
        ApiResponse<List<UserResponse>> response = new ApiResponse<>();
        response.setResult(userService.getUsers());
        return response;
    }
}
