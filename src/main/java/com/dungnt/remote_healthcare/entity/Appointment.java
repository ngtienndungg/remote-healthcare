package com.dungnt.remote_healthcare.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Document(collection = "bookings")
public class Appointment {
    @Id
    ObjectId _id;
    @Field(name = "patientID")
    User patient;
    String status;
    List<String> images;
    @Field(name = "scheduleID")
    Schedule schedule;
    String time;
    Boolean isPaid;
    String description;
}
