package com.dungnt.remote_healthcare.controller;

import com.dungnt.remote_healthcare.dto.response.ApiResponse;
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
        return ApiResponse.<UserResponse>builder()
                .result(userService.getUserById(id)).build();
    }

    @GetMapping
    public ApiResponse<List<UserResponse>> getUsers() {
        return ApiResponse.<List<UserResponse>>builder()
                .result(userService.getUsers()).build();
    }
}
