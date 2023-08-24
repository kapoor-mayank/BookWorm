package com.example.services;

import java.util.ArrayList;

import com.example.dtos.CartSendDto;
import com.example.entities.Cart;

public interface ICartService 
{
	public Cart addToCart(Cart cart);
	
	public ArrayList<Cart> getAllCartList();

}
