package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entities.InvoiceDetails;
import java.util.List;


@Repository
public interface InvoiceDetailRepository extends JpaRepository<InvoiceDetails, Long>{
	
	List<InvoiceDetails> findByTranType(String tranType);
	List<InvoiceDetails> findByQuantity(Long quantity);
	List<InvoiceDetails> findByBasePrice(Double basePrice);
	
	//@Query("UPDATE invoice_details SET quantity = :quantity WHERE inv_dtl_id = :Id")
	//InvoiceDetails updateInvoiceDetails(@Param(value = "Id") Long Id,@Param(value = "quantity")Long quantity);
	
}
