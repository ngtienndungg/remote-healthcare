package com.dungnt.remote_healthcare.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
class Rating {
    Integer star;
    User postedBy;
    String comment;
    Date updatedAt;
}