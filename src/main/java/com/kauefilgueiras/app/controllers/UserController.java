package com.kauefilgueiras.app.controllers;

import com.kauefilgueiras.app.dtos.UserDTO;
import com.kauefilgueiras.app.services.UserService;
import com.kauefilgueiras.app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAll() {
        return userService.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public User createUser(@RequestBody UserDTO userDTO) {
        return userService.createUser(userDTO);
    }

    @GetMapping("/{id}")
    public Optional<User> getById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        userService.deleteById(id);
    }

    @PutMapping("/{id}")
    public User update(@RequestBody UserDTO userDTO, @PathVariable Long id) {
        return userService.findById(id).map(user -> {
                    user.setName(userDTO.name());
                    user.setEmail(userDTO.email());
                    return userService.update(user);
                })
                .orElseThrow(() -> new RuntimeException("Error /PUT request"));
    }
}
