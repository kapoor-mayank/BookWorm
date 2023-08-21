package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.entities.InvoiceTable;
import com.example.services.InvoiceTableService;

import java.util.List;

@RestController
public class InvoiceTableController {

    @Autowired
    InvoiceTableService itService;

    @GetMapping("/invoicetable/{id}")
    public ResponseEntity<InvoiceTable> getById(@PathVariable Long id) {
        return itService.getInvoiceById(id);
    }

    @PostMapping("/invoicetable/add")
    public ResponseEntity<Void> addInvoice(@RequestBody InvoiceTable inv) {
        return itService.addInvoice(inv);
    }

    @DeleteMapping("/invoicetable/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        return itService.deleteByInvoiceId(id);
    }
}
