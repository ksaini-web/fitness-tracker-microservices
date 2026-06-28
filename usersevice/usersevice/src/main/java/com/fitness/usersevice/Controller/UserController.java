package com.fitness.usersevice.Controller;


import com.fitness.usersevice.dto.RegisterRequest;
import com.fitness.usersevice.dto.UserRespones;
import com.fitness.usersevice.models.User;
import com.fitness.usersevice.serivce.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserRespones> registerUser(@Valid @RequestBody RegisterRequest user) {

        UserRespones userRespones = userService.register(user);

        return ResponseEntity.ok(userRespones);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserRespones> getUser(@PathVariable String userId) {
        return ResponseEntity.ok(userService.getUserProfile(userId));
    }


}
