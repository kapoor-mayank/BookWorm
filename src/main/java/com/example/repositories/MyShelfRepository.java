package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entities.MyShelf;
import com.example.entities.ProductMaster;

@Repository
public interface MyShelfRepository extends JpaRepository<MyShelf, Long> {

	@Query(value = "SELECT * FROM product_master p JOIN my_shelf m ON p.product_id = m.product_id WHERE m.customer_id = :id", nativeQuery = true)

	List<Object[]> getByCustomerId(@Param("id") Long customerId);

}