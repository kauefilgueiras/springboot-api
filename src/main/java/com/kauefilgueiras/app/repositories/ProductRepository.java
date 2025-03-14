package com.kauefilgueiras.app.repositories;

import com.kauefilgueiras.app.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product save(Product product);
}
