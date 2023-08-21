package com.example.services;

import org.springframework.http.ResponseEntity;
import com.example.entities.CustomerMaster;
import com.example.entities.InvoiceTable;
import com.example.repositories.InvoiceTableRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Service
public class InvoiceTableServiceImpl implements InvoiceTableService {

    @Autowired
    InvoiceTableRepository repo;

    @Override
    public ResponseEntity<InvoiceTable> getInvoiceById(Long invoiceId) {
        Optional<InvoiceTable> invoiceOptional = repo.getByInvoiceId(invoiceId);

        if (invoiceOptional.isPresent()) {
            return ResponseEntity.ok(invoiceOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @Override
    public ResponseEntity<Void> deleteByInvoiceId(Long id) {
        repo.deleteByInvoiceId(id);
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<Void> addInvoice(InvoiceTable invoice) {
        repo.save(invoice);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<List<InvoiceTable>> getByCustomerId(CustomerMaster customerId) {
        List<InvoiceTable> invoices = repo.getByCustomerId(customerId);
        return ResponseEntity.ok(invoices);
    }

    @Override
    public ResponseEntity<Void> deleteByCustomerId(CustomerMaster custId) {
        repo.deleteByCustomerId(custId);
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<List<InvoiceTable>> getByInvoiceAmount(Double amount) {
        List<InvoiceTable> invoices = repo.getByInvoiceAmount(amount);
        return ResponseEntity.ok(invoices);
    }

    @Override
    public ResponseEntity<List<InvoiceTable>> getInvoiceByDate(Date date) {
        List<InvoiceTable> invoices = repo.getByInvoiceDate(date);
        return ResponseEntity.ok(invoices);
    }

    @Override
    public ResponseEntity<Void> deleteByInvoiceDate(Date date) {
        repo.deleteByInvoiceDate(date);
        return ResponseEntity.noContent().build();
    }
}
