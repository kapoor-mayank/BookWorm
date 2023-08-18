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
	
	@Query("UPDATE InvoiceDetails SET quantity = :quantity WHERE invDtlId = :invDtlId")
	InvoiceDetails updateQuantity(@Param(value = "invDtlId") Long Id,@Param(value = "quantity")Long quantity);
	
	@Query("UPDATE InvoiceDetails SET tranType = :tranType WHERE invDtlId = :invDtlId")
	InvoiceDetails updateTranType(@Param(value = "invDtlId") Long Id,@Param(value = "tranType")String tranType);
}
