package com.example.controllers;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.services.InvoiceDetailService;


import com.example.entities.InvoiceDetails;

@RestController
public class InvoiceDeatilsController {
	
	@Autowired
	private InvoiceDetailService service;
	
	@GetMapping("/api/InvoiceDetails")
	public List<InvoiceDetails> getAllInvoiceDetails()
	{
		return service.getAllInvoiceDetails();
	}
	

	@GetMapping("/api/InvoiceDetails/{Id}")
	public Optional<InvoiceDetails> getInvDtlId(@PathVariable Long id) 
	{
		return service.getByInvDtlId(id);
	}
	
	@GetMapping("/api/TranType/{tranType}")
	public List<InvoiceDetails> gettranType(@PathVariable String tranType) 
	{
		return service.getByTranType(tranType);
	}
	@GetMapping("/api/Baseprice/{basePrice}")
	public List<InvoiceDetails> getByBasePrice(@PathVariable Double basePrice)
	{
		return service.getByBasePrice(basePrice);
	}
	@PostMapping("/api/InvoiceDetails")
	public void setInvoiceDetails(@RequestBody InvoiceDetails invdtl) {
		service.setInvoiceDetails(invdtl);
	}
	@DeleteMapping("/api/InvoiceDetails/{Id}")
	public Optional<InvoiceDetails> deleteInvoiceDetailsById(@PathVariable Long id){
		Optional<InvoiceDetails> InvDtl = service.deleteInvoiceDetailsById(id);
		return InvDtl;
	}
	@PutMapping("/api/updateQuantity")
	public InvoiceDetails updateQuantity(@PathVariable Long Id,@RequestBody InvoiceDetails inv) {
		return service.updateQuantity(Id, inv);
	}
	@PutMapping("/api/updateTranType")
	public InvoiceDetails updateTranType(@PathVariable Long Id,@RequestBody InvoiceDetails inv) {
		return service.updateTranType(Id, inv);
	}
	
	
}