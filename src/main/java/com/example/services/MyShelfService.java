package com.example.services;

import java.util.List;

import com.example.entities.MyShelf;
import com.example.entities.ProductMaster;

public interface MyShelfService {
    MyShelf getById(Long shelfId);

    List<Object[]> getByCustomerId(Long customerId);

}