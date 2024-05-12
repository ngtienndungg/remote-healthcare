package com.dungnt.remote_healthcare.controller;

import com.dungnt.remote_healthcare.dto.request.ApiResponse;
import com.dungnt.remote_healthcare.dto.response.AppointmentResponse;
import com.dungnt.remote_healthcare.service.AppointmentService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequestMapping("/appointment")
public class AppointmentController {
    AppointmentService appointmentService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ApiResponse<AppointmentResponse> getAppointmentById(@PathVariable("id") String id) {
        ApiResponse<AppointmentResponse> response = new ApiResponse<>();
        response.setResult(appointmentService.getAppointment(id));
        return response;
    }

    @GetMapping
    public ApiResponse<List<AppointmentResponse>> getUsers() {
        ApiResponse<List<AppointmentResponse>> response = new ApiResponse<>();
        response.setResult(appointmentService.getAppointments());
        return response;
    }
}
