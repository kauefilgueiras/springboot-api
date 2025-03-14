package com.kauefilgueiras.app.repositories;

import com.kauefilgueiras.app.model.Order;
import com.kauefilgueiras.app.model.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderProductRepository extends JpaRepository<Order, Long> {
    OrderProduct save(OrderProduct orderProduct);

}
