package com.dungnt.remote_healthcare.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Document(collection = "doctors")
public class Doctor {
    @Id
    private String id;
    @Field(name = "clinicID")
    private Clinic clinic;
    private String description;
    @Field(name = "specialtyID")
    private Specialty specialty;
    private String position;
    private List<Rating> ratings;
    private Integer totalRatings;
}