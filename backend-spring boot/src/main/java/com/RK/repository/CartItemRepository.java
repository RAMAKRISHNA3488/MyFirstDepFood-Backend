package com.RK.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RK.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


//    CartItem findByFoodIsContaining

}
