package com.fitness.activityservice.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.Map;

@Document("activities")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Activity {

    @GeneratedValue(strategy= GenerationType.AUTO)
    private  String id;
    private  String userId;
    private  ActivityType type;
    private  Integer duration;
    private  Integer caloriesBurned;
    @CreatedDate
    private LocalDateTime startTime;

    @Field("metrics")
    private Map<String,Object> attributes;


    private LocalDateTime updateTime;


}
