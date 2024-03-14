package com.nelson.orderservice.dto;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Builder
@Getter
public class OrderLineItemsDto {
    private Long id; private String skuCode; private BigDecimal price; private Integer quantity;
}
