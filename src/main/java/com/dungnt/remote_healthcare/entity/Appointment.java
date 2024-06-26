package com.dungnt.remote_healthcare.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Reference;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Document(collection = "bookings")
public class Appointment {
    @Id
    String _id;
    @Reference
    User patientID;
    String status;
    List<String> images;
    @Reference
    Schedule scheduleID;
    String time;
    Boolean isPaid;
    String description;
}
