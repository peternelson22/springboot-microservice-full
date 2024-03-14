package com.nelson.productservice.util;

import com.nelson.productservice.entity.Product;
import com.nelson.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {
    private final ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        if (productRepository.count() < 1) {
            Product product = new Product();
            product.setName("IPhone 13");
            product.setDescription("iPhone 13");
            product.setPrice(BigDecimal.valueOf(1000));

            productRepository.save(product);
        }
    }
}