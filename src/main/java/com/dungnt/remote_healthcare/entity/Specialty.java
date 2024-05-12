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
@Document(collection = "specialties")
public class Specialty {
    @Id
    String _id;
    String name;
}
