package com.RK.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RK.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
