package com.fitness.activityservice.activityRepository;


import com.fitness.activityservice.model.Activity;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ActivityRepository extends MongoRepository<Activity,Long> {
}
