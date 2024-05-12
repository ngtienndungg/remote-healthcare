package com.dungnt.remote_healthcare.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Document(collection = "remoteSchedule")
public class RemoteSchedule {
    @Id
    String _id;
    Doctor doctor;
    Long price;
}
