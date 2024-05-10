package com.dungnt.remote_healthcare.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Document(collection = "clinics")
public class Clinic {
    @Id
    private String id;
    private String name;
    private Address address;
    private String image;
    @Field(name = "specialtyID")
    private List<Specialty> specialties;
    private List<Integer> ratings;
    private Integer totalRatings;
    private User host;
    private String description;
    private List<String> descriptionImg;

    @Getter
    @Setter
    @NoArgsConstructor
    private static class Address {
        private String province;
        private String district;
        private String ward;
        private String detail;
    }
}
