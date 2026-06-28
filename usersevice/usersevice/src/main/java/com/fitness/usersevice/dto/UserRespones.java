package com.fitness.usersevice.dto;

import com.fitness.usersevice.models.UserRole;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserRespones {


    private String id;

    private String firstName;
    private String lastName;


    private String email;




    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
