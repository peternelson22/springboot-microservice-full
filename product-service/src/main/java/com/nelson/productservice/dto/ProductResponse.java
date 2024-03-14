package com.nelson.productservice.dto;

import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record ProductResponse(Long id, String name, String description, BigDecimal price) {
}
