package com.example.services;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.entities.CustomerMaster;

public interface CustomerService extends UserDetailsService{
	public void addCustomer(CustomerMaster customer);
	
	public CustomerMaster  getCustomerById(long id);
	
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException ;
	
	public CustomerMaster getByEmail(String email);
	
	
	
	
}
