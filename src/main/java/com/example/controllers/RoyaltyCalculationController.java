package com.example.controllers;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dtos.RoyalityDto;
import com.example.entities.BeneficiaryMaster;
import com.example.entities.InvoiceTable;
import com.example.entities.ProductMaster;
import com.example.entities.RoyaltyCalculation;
import com.example.services.RoyaltyCalculationService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/royalty")
public class RoyaltyCalculationController 
{
	



}
