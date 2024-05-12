package com.dungnt.remote_healthcare.mapper;

import com.dungnt.remote_healthcare.dto.response.AppointmentResponse;
import com.dungnt.remote_healthcare.entity.Appointment;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AppointmentMapper {
    AppointmentResponse toAppointmentResponse(Appointment appointment);

    List<AppointmentResponse> toAppointmentResponses(List<Appointment> appointments);
}
