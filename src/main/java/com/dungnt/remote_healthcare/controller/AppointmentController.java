package com.dungnt.remote_healthcare.controller;

import com.dungnt.remote_healthcare.dto.response.ApiResponse;
import com.dungnt.remote_healthcare.dto.response.AppointmentResponse;
import com.dungnt.remote_healthcare.service.AppointmentService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequestMapping("/appointment")
@Slf4j
public class AppointmentController {
    AppointmentService appointmentService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ApiResponse<AppointmentResponse> getAppointmentById(@PathVariable("id") String id) {
        return ApiResponse.<AppointmentResponse>builder().
                result(appointmentService.getAppointment(id)).build();
    }

    @GetMapping
    public ApiResponse<List<AppointmentResponse>> getAppointments() {
        Authentication nauthentication = SecurityContextHolder.getContext().getAuthentication();
        log.info(nauthentication.getName());
        log.info(nauthentication.getAuthorities().toString());
        return ApiResponse.<List<AppointmentResponse>>builder()
                .result(appointmentService.getAppointments()).build();
    }
}
