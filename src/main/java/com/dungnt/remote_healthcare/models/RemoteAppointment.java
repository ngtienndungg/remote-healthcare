package com.dungnt.remote_healthcare.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
public class RemoteAppointment {
    @Id
    private String id;
    private User patient;
    private Schedule schedule;
    private Boolean isPaid;
    private Date startTime;
    private Date expiredTime;
}
