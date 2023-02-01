package com.sdp.orderservice.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "t_order_item")
public class OrderItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String itemCode;
    private BigDecimal price;
    private Integer quantity;
}
