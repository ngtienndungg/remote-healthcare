package com.dungnt.remote_healthcare.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Document(collection = "remoteAppointment")
public class RemoteAppointment {
    @Id
    ObjectId _id;
    User patient;
    Schedule schedule;
    Boolean isPaid;
    Date startTime;
    Date expiredTime;
}
