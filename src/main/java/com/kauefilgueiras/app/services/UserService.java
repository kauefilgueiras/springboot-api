package com.kauefilgueiras.app.services;

import com.kauefilgueiras.app.dtos.UserDTO;
import com.kauefilgueiras.app.model.User;
import com.kauefilgueiras.app.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(UserDTO userDTO){
        User user = new User();
        user.setName(userDTO.name());
        user.setEmail(userDTO.email());
        return userRepository.save(user);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User update(User user){
        return userRepository.save(user);
    }

    public Optional<User> findById(Long id){
        return userRepository.findById(id);
    }

    public void deleteById(Long id){
        userRepository.deleteById(id);
    }
}
