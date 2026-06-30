package com.fitness.activityservice.model;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.Map;

@Document(collection = "activities")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Activity {

    @Id
    private String id;

    private String userId;

    private ActivityType type;

    private Integer duration;

    private Integer caloriesBurned;

    @CreatedDate
    private LocalDateTime startTime;

    @Field("metrics")
    private Map<String, Object> attributes;

    @LastModifiedDate
    private LocalDateTime updateTime;
}