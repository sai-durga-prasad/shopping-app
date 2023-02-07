package com.sdp.orderservice.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemsDto {

    private Long id;
    private String itemCode;
    private BigDecimal price;
    private Integer quantity;
}
