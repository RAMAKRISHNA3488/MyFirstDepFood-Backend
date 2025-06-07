package com.RK.service;

import java.util.List;

import com.RK.model.Notification;
import com.RK.model.Order;
import com.RK.model.Restaurant;
import com.RK.model.User;

public interface NotificationService {
	
	public Notification sendOrderStatusNotification(Order order);
	public void sendRestaurantNotification(Restaurant restaurant, String message);
	public void sendPromotionalNotification(User user, String message);
	
	public List<Notification> findUsersNotification(Long userId);

}
