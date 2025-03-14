package com.kauefilgueiras.app.dtos;

import com.kauefilgueiras.app.model.Product;

public record UserDTO(String name, String email, Product product) {
}
