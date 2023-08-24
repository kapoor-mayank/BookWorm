package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entities.CustomerMaster;

@Repository
public interface CustomerMasterRepository extends JpaRepository<CustomerMaster, Long> {
    @Query("SELECT c FROM CustomerMaster c WHERE c.customerId = ?1")
    CustomerMaster getById(Long id);
}
