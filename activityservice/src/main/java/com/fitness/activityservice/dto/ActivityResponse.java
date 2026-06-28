package com.fitness.activityservice.dto;

import com.fitness.activityservice.model.ActivityType;

import lombok.Data;


import java.time.LocalDateTime;
import java.util.Map;
@Data
public class ActivityResponse {

    private  String id;
    private  String userId;
    private ActivityType type;
    private  Integer duration;
    private  Integer caloriesBurned;

    private LocalDateTime startime;


    private Map<String,Object> attributes;


    private LocalDateTime updateTime;

}
