package com.RK.service;

import com.RK.Exception.CartException;
import com.RK.Exception.CartItemException;
import com.RK.Exception.FoodException;
import com.RK.Exception.UserException;
import com.RK.model.Cart;
import com.RK.model.CartItem;
import com.RK.model.Food;
import com.RK.model.User;
import com.RK.request.AddCartItemRequest;
import com.RK.request.UpdateCartItemRequest;

public interface CartSerive {

	public CartItem addItemToCart(AddCartItemRequest req, String jwt) throws UserException, FoodException, CartException, CartItemException;

	public CartItem updateCartItemQuantity(Long cartItemId,int quantity) throws CartItemException;

	public Cart removeItemFromCart(Long cartItemId, String jwt) throws UserException, CartException, CartItemException;

	public Long calculateCartTotals(Cart cart) throws UserException;
	
	public Cart findCartById(Long id) throws CartException;
	
	public Cart findCartByUserId(Long userId) throws CartException, UserException;
	
	public Cart clearCart(Long userId) throws CartException, UserException;
	

	

}
