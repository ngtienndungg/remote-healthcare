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
@Document(collection = "doctors")
public class Doctor {
    @Id
    ObjectId _id;
    @Field(name = "clinicID")
    Clinic clinic;
    String description;
    @Field(name = "specialtyID")
    Specialty specialty;
    String position;
    List<Rating> ratings;
    Integer totalRatings;
}