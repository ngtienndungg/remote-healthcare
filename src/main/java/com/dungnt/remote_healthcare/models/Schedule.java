package com.dungnt.remote_healthcare.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class Schedule {
    @Id
    private String id;
    @Field(name = "doctorID")
    private String doctor;
    @Field(name = "cost")
    private Long price;
    private Date date;
    @Field(name = "timeType")
    private List<TimeType> timeList;

    @NoArgsConstructor
    @Getter
    @Setter
    private static class TimeType {
        private boolean isFull;
        private String time;
        private int maxNumber;
    }
}
