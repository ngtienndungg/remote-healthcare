package com.dungnt.remote_healthcare.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Document(collection = "schedule")
public class Schedule {
    @Id
    ObjectId _id;
    @Field(name = "doctorID")
    String doctor;
    @Field(name = "cost")
    Long price;
    Date date;
    @Field(name = "timeType")
    List<TimeType> timeList;

    @NoArgsConstructor
    @Data
    @FieldDefaults(level = AccessLevel.PRIVATE)
    private static class TimeType {
        boolean isFull;
        String time;
        int maxNumber;
    }
}
