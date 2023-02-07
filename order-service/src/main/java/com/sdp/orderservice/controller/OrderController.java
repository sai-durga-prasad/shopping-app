package com.sdp.orderservice.controller;

import com.sdp.orderservice.dto.OrderRequest;
import com.sdp.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest){
        //TO-DO : implement order placing logic here
        orderService.placeOrder(orderRequest);
        return "Order Placed Successfully";
    }
}
