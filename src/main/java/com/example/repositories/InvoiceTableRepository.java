package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.sql.Date;
import com.example.entities.CustomerMaster;
import com.example.entities.InvoiceTable;

@Repository
@Transactional
public interface InvoiceTableRepository extends JpaRepository<InvoiceTable, Long> {

    Optional<InvoiceTable> getByInvoiceId(Long invoiceId);

    List<InvoiceTable> getByInvoiceDate(Date invoiceDate);

    List<InvoiceTable> getByInvoiceAmount(Double invoiceAmount);

    List<InvoiceTable> getByCustomerId(CustomerMaster customerId);

    void deleteByInvoiceId(Long invoiceId);

    void deleteByCustomerId(CustomerMaster customerId);

    void deleteByInvoiceDate(Date invoiceDate);
}
