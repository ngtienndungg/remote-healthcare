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
@Document(collection = "clinics")
public class Clinic {
    @Id
    ObjectId _id;
    String name;
    Address address;
    String image;
    @Field(name = "specialtyID")
    List<Specialty> specialties;
    List<Integer> ratings;
    Integer totalRatings;
    User host;
    String description;
    List<String> descriptionImg;

    @NoArgsConstructor
    @Data
    @FieldDefaults(level = AccessLevel.PRIVATE)
    private static class Address {
        String province;
        String district;
        String ward;
        String detail;
    }
}
