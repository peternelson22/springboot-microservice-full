package com.nelson.orderservice.service;

import com.nelson.orderservice.dto.OrderRequest;

public interface OrderService {
    String placeOrder(OrderRequest orderRequest);
}
