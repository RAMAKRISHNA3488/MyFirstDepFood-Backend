package com.RK.service;

import java.util.List;

import com.RK.Exception.CartException;
import com.RK.Exception.OrderException;
import com.RK.Exception.RestaurantException;
import com.RK.Exception.UserException;
import com.RK.model.Order;
import com.RK.model.PaymentResponse;
import com.RK.model.User;
import com.RK.request.CreateOrderRequest;
import com.stripe.exception.StripeException;

public interface OrderService {
	
	// public PaymentResponse createOrder(CreateOrderRequest order, User user) throws UserException, RestaurantException, CartException, StripeException;
	 
	 public Order updateOrder(Long orderId, String orderStatus) throws OrderException;
	 
	 public void cancelOrder(Long orderId) throws OrderException;
	 
	 public List<Order> getUserOrders(Long userId) throws OrderException;
	 
	 public List<Order> getOrdersOfRestaurant(Long restaurantId,String orderStatus) throws OrderException, RestaurantException;
	 

}
