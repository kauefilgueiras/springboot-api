package com.kauefilgueiras.app.services;

import com.kauefilgueiras.app.dtos.ProductDTO;
import com.kauefilgueiras.app.model.Product;
import com.kauefilgueiras.app.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(ProductDTO productDTO){
        Product product = new Product();
        product.setName(productDTO.name());
        product.setCategoria(productDTO.categoria());
        product.setMarca(productDTO.marca());
        return productRepository.save(product);
    }

    public List <Product> findAll(){
        return productRepository.findAll();
    }

    public Product updateProduct(Product product){
        return productRepository.save(product);
    }

    public Optional <Product> findById(Long id){
        return productRepository.findById(id);
    }

    public void deleteById(Long id){
        productRepository.deleteById(id);
    }
}
