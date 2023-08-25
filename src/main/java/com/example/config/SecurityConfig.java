package com.example.config;

import java.net.http.HttpHeaders;
import java.util.Arrays;

import org.apache.catalina.filters.CorsFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;

import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;


import com.example.security.JwtAuthenticationEntryPoint;
import com.example.security.JwtAuthenticationFilter;
import org.springframework.web.filter.*;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import jakarta.servlet.FilterRegistration;
import jakarta.servlet.http.HttpServletRequest;

@Configuration
public class SecurityConfig {

	@Autowired
	private JwtAuthenticationEntryPoint point;
	@Autowired
	private JwtAuthenticationFilter filter;

	@Autowired
	private CorsConfigurationSource corsConfigurationSource;

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

//		http.csrf(csrf -> csrf.disable()).authorizeRequests().requestMatchers("/test").authenticated()
//				.requestMatchers("/auth/login").permitAll().anyRequest().authenticated().and()
//				.exceptionHandling(ex -> ex.authenticationEntryPoint(point))
//				.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
//		http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
//		return http.build();
//		http
//        .csrf().disable()
//        .cors().configurationSource(corsConfigurationSource)
//        .and()
//        .authorizeRequests(authorizeRequests ->
//            authorizeRequests
//                .requestMatchers(HttpMethod.POST, "/auth/login").permitAll()
//                .requestMatchers("/test").authenticated()
//                .anyRequest().authenticated()
//        )
//        .exceptionHandling(ex -> ex.authenticationEntryPoint(point))
//        .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
//
//    http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
//	return null;
		http
        .csrf().disable() // Disable CSRF
        .cors().and() // Enable CORS
        .authorizeRequests(authorizeRequests ->
            authorizeRequests
                .requestMatchers(HttpMethod.POST, "/auth/login", "/api/customer/add", "/api/products/getProducts", "/api/products/getByType/{id}").permitAll() // Allow login
                .requestMatchers("/test").authenticated() // Protect "/test"
        )
        .authorizeRequests()
            .anyRequest().authenticated() // Require authentication for other requests
        .and()
        .exceptionHandling(ex -> ex.authenticationEntryPoint(point)) // Exception handling
        .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));


    http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
    return http.build(); // Build and return the SecurityFilterChain


	}
//
//	// CORS Configuration
//	public void addCorsMappings(CorsRegistry registry) {
//	    registry.addMapping("/**")
//	        .allowedOrigins("*")
//	        .allowedMethods("PUT", "DELETE", "GET", "POST", "OPTIONS")
//	        .allowedHeaders("Authorization", "Content-Type", "Accept")
//	        .exposedHeaders("Authorization", "Content-Type", "Accept")
//	        .allowCredentials(true).maxAge(3600);
//	}
//	@Bean
//	 public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//		http
//        .csrf(csrf -> csrf.disable())
//        .cors(cors -> cors.configurationSource(corsConfigurationSource))
//        .authorizeRequests(authorizeRequests ->
//            authorizeRequests
//                .antMatchers(HttpMethod.POST, "/auth/login").permitAll()
//                .antMatchers("/test").authenticated()
//                .anyRequest().authenticated()
//        )
//        .exceptionHandling(ex -> ex.authenticationEntryPoint(point))
//        .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
//
//    http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
//    return http.build();
//
//
//	 }
}
