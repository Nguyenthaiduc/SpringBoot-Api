package com.tutorial.apidemo.Springboot.repositories;
//noi chua lay du lieu tu data ve
import com.tutorial.apidemo.Springboot.models.Product; //import models

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product> findByProductName(String productName);}
