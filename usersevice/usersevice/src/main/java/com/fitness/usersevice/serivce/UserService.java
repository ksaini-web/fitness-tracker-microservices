package com.fitness.usersevice.serivce;

import com.fitness.usersevice.dto.RegisterRequest;
import com.fitness.usersevice.dto.UserRespones;
import com.fitness.usersevice.models.User;
import com.fitness.usersevice.repo.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserRespones register(RegisterRequest registerRequest) {

        if(userRepository.existsByEmail(registerRequest.getEmail())){

            throw new RuntimeException("Email already exists");
        }

        User user = new User();
        user.setEmail(registerRequest.getEmail());
        user.setRole(registerRequest.getRole());
        user.setLastName(registerRequest.getLastName());
        user.setFirstName(registerRequest.getFirstName());
        user.setPassword(registerRequest.getPassword());
         user = userRepository.save(user);
        UserRespones userRespones = new UserRespones();

        userRespones.setEmail(user.getEmail());
        userRespones.setFirstName(user.getFirstName());
        userRespones.setLastName(user.getLastName());
        userRespones.setCreatedAt(user.getCreatedAt());
        userRespones.setUpdatedAt(user.getUpdatedAt());
        userRespones.setId(user.getId());





        return userRespones;










    }

    public UserRespones getUserProfile(String userId) {

        User user = userRepository.findById(userId)
                .orElseThrow(()->new RuntimeException("User Not Found"));
        UserRespones userRespones = new UserRespones();
        userRespones.setEmail(user.getEmail());
        userRespones.setFirstName(user.getFirstName());
        userRespones.setLastName(user.getLastName());
        userRespones.setCreatedAt(user.getCreatedAt());
        userRespones.setUpdatedAt(user.getUpdatedAt());
        userRespones.setId(user.getId());
        return userRespones;


    }
}
