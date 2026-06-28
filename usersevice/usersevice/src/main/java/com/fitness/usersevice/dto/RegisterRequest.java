package com.fitness.usersevice.dto;

import com.fitness.usersevice.models.UserRole;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Data
public class RegisterRequest {

    private String firstName;
    private String lastName;
    @NotBlank(message ="Email is required")
    @Email(message = "Invaild Email Format")
    private String email;

    @NotBlank(message = "password is required")
    @Size(message = "password mush have atleast 6 characters")
    private String password;
    private UserRole role;


}
