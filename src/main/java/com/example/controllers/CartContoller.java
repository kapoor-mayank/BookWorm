package com.example.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dtos.CartDto;
import com.example.dtos.CartSendDto;
import com.example.entities.Cart;
import com.example.entities.CustomerMaster;
import com.example.entities.ProductMaster;
import com.example.services.CustomerService;
import com.example.services.ICartService;
import com.example.services.IProductMasterService;

@RestController
@RequestMapping("/api/cart")
@CrossOrigin("*")
public class CartContoller {
	@Autowired
	ICartService cartService;
	@Autowired
	CustomerService custService;
	@Autowired
	IProductMasterService prodService;

	@PostMapping("/addtocart")
	public ResponseEntity<Map<String, String>> addToCart(@RequestBody CartDto cart) {
		System.out.println("Cart " + cart);
		try {
			CustomerMaster user = custService.getCustomerById(cart.getCustomerId());
			ProductMaster product = prodService.getProduct(cart.getProductId());
			Cart cartItem = new Cart();
			cartItem.setCustomer(user);
			cartItem.setProduct(product);
			cartItem.setType(cart.getType());
			cartItem.setQuantity(cart.getQuantity());

			cartService.addToCart(cartItem);

			// Return a JSON response with a success message
			Map<String, String> response = new HashMap<>();
			response.put("message", "ok");

			return ResponseEntity.ok(response);
		} catch (Exception e) {
			e.printStackTrace();

			// Return a JSON response with an error message
			Map<String, String> errorResponse = new HashMap<>();
			errorResponse.put("error", "Fail");

			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
		}
	}

	@GetMapping("/deleteFromCart/{id}")
	public ResponseEntity<Map<String, String>> deleteFromCart(@PathVariable long id) {

		try {
			System.out.println("Delete "+id);

			cartService.deleteById(id);

			// Return a JSON response with a success message
			Map<String, String> response = new HashMap<>();
			response.put("message", "ok");

			return ResponseEntity.ok(response);
		} catch (Exception e) {
			e.printStackTrace();

			// Return a JSON response with an error message
			Map<String, String> errorResponse = new HashMap<>();
			errorResponse.put("error", "Fail");

			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
		}
	}

	@GetMapping("/getallcart")
	public ResponseEntity<List<CartSendDto>> getAllCartItem() {
		try {
			List<CartSendDto> list = new ArrayList<>();
			List<Cart> cartList = cartService.getAllCartList();

			for (Cart cartItem : cartList) {
				CartSendDto obj = new CartSendDto();
				obj.setId(cartItem.getCartId());
				obj.setPrice(cartItem.getProduct().getProductSpCost());
				obj.setProductName(cartItem.getProduct().getProductName());
				obj.setQuantity(cartItem.getQuantity());
				obj.setTotalPrice(cartItem.getQuantity() * cartItem.getProduct().getProductSpCost());
				obj.setType(cartItem.getType());

				list.add(obj);
			}

			return ResponseEntity.ok(list);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

}
