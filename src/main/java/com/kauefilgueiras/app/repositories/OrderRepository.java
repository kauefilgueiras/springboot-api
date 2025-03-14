package com.kauefilgueiras.app.repositories;

import com.kauefilgueiras.app.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository <Order, Long> {
    Order save(Order order);
}
