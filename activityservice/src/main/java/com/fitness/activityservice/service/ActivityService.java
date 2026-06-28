package com.fitness.activityservice.service;

import com.fitness.activityservice.activityRepository.ActivityRepository;
import com.fitness.activityservice.dto.ActivityRequest;
import com.fitness.activityservice.dto.ActivityResponse;
import com.fitness.activityservice.model.Activity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class ActivityService {

    private final ActivityRepository activityRepository;

    public ActivityResponse trackActivity(ActivityRequest newActivity) {

        System.out.println(newActivity);
        System.out.println("UserId: " + newActivity.getUserId());
        System.out.println("Type: " + newActivity.getType());
        System.out.println("Duration: " + newActivity.getDuration());
        System.out.println("Calories: " + newActivity.getCaloriesBurned());
        Activity activity = Activity.builder()
                .userId(newActivity.getUserId())
                .type(newActivity.getType())
                .duration(newActivity.getDuration())
                .caloriesBurned(newActivity.getCaloriesBurned())
                .startTime(LocalDateTime.now())
                .attributes(newActivity.getAttributes())
                .build();

        Activity savedActivity = activityRepository.save(activity);

        return mapToResponse(savedActivity);




    }

    private ActivityResponse mapToResponse(Activity savedActivity) {

        ActivityResponse activityResponse = new ActivityResponse();


        activityResponse.setId(savedActivity.getId());
        activityResponse.setUserId(savedActivity.getUserId());
        activityResponse.setType(savedActivity.getType());
        activityResponse.setDuration(savedActivity.getDuration());
        activityResponse.setCaloriesBurned(savedActivity.getCaloriesBurned());
        activityResponse.setAttributes(savedActivity.getAttributes());
        activityResponse.setStartime(savedActivity.getStartTime());
        activityResponse.setUpdateTime(savedActivity.getUpdateTime());
        return activityResponse;



    }
}
