package com.fitness.activityservice.dto;

import com.fitness.activityservice.model.ActivityType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActivityRequest {


    private  String userId;
    private ActivityType type;
    private  Integer duration;
    private  Integer caloriesBurned;



    private Map<String,Object> attributes;






}
