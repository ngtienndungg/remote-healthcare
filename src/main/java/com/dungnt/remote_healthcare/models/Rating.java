package com.dungnt.remote_healthcare.models;

import lombok.*;

import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
class Rating {
    private Integer star;
    private User postedBy;
    private String comment;
    private Date updatedAt;
}