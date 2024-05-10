package com.dungnt.remote_healthcare.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@Getter
@Setter
@Document(collection = "remoteSchedule")
public class RemoteSchedule {
    @Id
    private String id;
    private Doctor doctor;
    private Long price;
}
