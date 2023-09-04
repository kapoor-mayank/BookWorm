package com.example.controllers;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.CustomerMaster;
import com.example.entities.JwtRequest;
import com.example.entities.JwtResponse;
import com.example.security.JwtHelper;
import com.example.services.CustomerService;

@RestController
@CrossOrigin("*")
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private AuthenticationManager manager;

    @Autowired
    private CustomerService customerService;
    
    @Autowired
    private JwtHelper helper;
    
    @Autowired
    private CustomerService custService;

    private Logger logger = LoggerFactory.getLogger(AuthController.class);


    @PostMapping("/login")
    public ResponseEntity<JwtResponse> login(@RequestBody JwtRequest request) {
    	System.out.println("Inside the auth controller...1");

        this.doAuthenticate(request.getEmail(), request.getPassword());
        System.out.println("Inside the auth controller...2");


        UserDetails userDetails = userDetailsService.loadUserByUsername(request.getEmail());
        System.out.println("Inside the auth controller...3");
        
        CustomerMaster obj = custService.getByEmail(request.getEmail());
        long id = obj.getCustomerId();
        System.out.println("Inside the auth controller...4");
        
        String token = this.helper.generateToken(userDetails);
        
        System.out.println("Inside the auth controller...5");

        JwtResponse response = JwtResponse.builder()
                .jwtToken(token)
                .username(userDetails.getUsername())
                .userId(id)
                
                .build();
        
        System.out.println("Inside the auth controller...6 "+response);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    private void doAuthenticate(String email, String password) {
    	System.out.println("Inside the auth controller doAuthenticate...1");
        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(email, password);
    	System.out.println("Inside the auth controller doAuthenticate...2 "+authentication);
        try {
        	System.out.println("Inside the auth controller doAuthenticate...3 "+manager.authenticate(authentication));
           
        } catch (BadCredentialsException e) {
            throw new BadCredentialsException(" Invalid Username or Password  !!");
        }

    }

    @ExceptionHandler(BadCredentialsException.class)
    public String exceptionHandler() {
    	System.out.println("inside the authController  exceptionHandler...4");
        return "Credentials Invalid !!";
    }

    
}
