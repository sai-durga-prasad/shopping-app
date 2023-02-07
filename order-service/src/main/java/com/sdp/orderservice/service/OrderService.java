package com.sdp.orderservice.service;

import com.sdp.orderservice.dto.OrderRequest;
import com.sdp.orderservice.model.Order;
import com.sdp.orderservice.model.OrderItems;
import com.sdp.orderservice.repository.OrderRepository;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    public void placeOrder(OrderRequest orderRequest){
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());

        List<OrderItems> orderItems = orderRequest.getOrderItemsDtoList()
                .stream()
                .map(orderItemsDto -> {
                    OrderItems items = new OrderItems();
                    items.setItemCode(orderItemsDto.getItemCode());
                    items.setPrice(orderItemsDto.getPrice());
                    items.setQuantity(orderItemsDto.getQuantity());
                    return items;
                }).collect(Collectors.toList());
        order.setOrderItems(orderItems);

        orderRepository.save(order);
    }
}
