package com.practice.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class OrderLineItemsDto {
    private Long id;
    private String skuCode;
    private double price;
    private Integer quantity;
}
