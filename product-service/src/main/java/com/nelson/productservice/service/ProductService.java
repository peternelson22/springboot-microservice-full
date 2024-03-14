package com.nelson.productservice.service;

import com.nelson.productservice.dto.ProductRequest;
import com.nelson.productservice.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    void save(ProductRequest productRequest);

    List<ProductResponse> getAllProducts();
}
