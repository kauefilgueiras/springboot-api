package com.kauefilgueiras.app.repositories;

import com.kauefilgueiras.app.dtos.UserDTO;
import com.kauefilgueiras.app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User save(User user);
}
