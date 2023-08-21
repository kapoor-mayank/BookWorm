package com.example.services;

import org.springframework.http.ResponseEntity;
import com.example.entities.CustomerMaster;
import com.example.entities.InvoiceTable;

import java.sql.Date;
import java.util.List;

public interface InvoiceTableService {

    ResponseEntity<InvoiceTable> getInvoiceById(Long invoiceId);

    ResponseEntity<Void> deleteByInvoiceId(Long id);

    ResponseEntity<Void> addInvoice(InvoiceTable invoice);

    ResponseEntity<List<InvoiceTable>> getByCustomerId(CustomerMaster customerId);

    ResponseEntity<Void> deleteByCustomerId(CustomerMaster custId);

    ResponseEntity<List<InvoiceTable>> getByInvoiceAmount(Double amount);

    ResponseEntity<List<InvoiceTable>> getInvoiceByDate(Date date);

    ResponseEntity<Void> deleteByInvoiceDate(Date date);
}
