package com.dungnt.remote_healthcare.service;

import com.dungnt.remote_healthcare.dto.response.AppointmentResponse;
import com.dungnt.remote_healthcare.entity.Appointment;
import com.dungnt.remote_healthcare.mapper.AppointmentMapper;
import com.dungnt.remote_healthcare.repository.AppointmentRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AppointmentService {
    AppointmentRepository appointmentRepository;
    AppointmentMapper appointmentMapper;

    public List<AppointmentResponse> getAppointments() {
        List<Appointment> users = appointmentRepository.findAll();
        return appointmentMapper.toAppointmentResponses(users);
    }

    public AppointmentResponse getAppointment(String _id) {
        Appointment appointment = appointmentRepository.findBy_id(_id);
        return appointmentMapper.toAppointmentResponse(appointment);
    }
}
