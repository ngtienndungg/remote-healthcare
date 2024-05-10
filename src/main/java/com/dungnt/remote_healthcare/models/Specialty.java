package com.dungnt.remote_healthcare.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@Getter
@Setter
@Document(collection = "specialties")
public class Specialty {
    @Id
    private String id;
    private String name;
}
