package com.dungnt.remote_healthcare.dto.response;

import com.dungnt.remote_healthcare.entity.Schedule;
import com.dungnt.remote_healthcare.entity.User;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AppointmentResponse {
    String _id;
    User patientID;
    String status;
    List<String> images;
    Schedule scheduleID;
    String time;
    Boolean isPaid;
    String description;
}
