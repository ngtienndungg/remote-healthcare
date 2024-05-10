package com.dungnt.remote_healthcare.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Document(collection = "bookings")
public class Appointment {
    @Id
    private String id;
    @Field(name = "patientID")
    private User patient;
    private String status;
    private List<String> images;
    @Field(name = "scheduleID")
    private Schedule schedule;
    private String time;
    private Boolean isPaid;
    private String description;
}
