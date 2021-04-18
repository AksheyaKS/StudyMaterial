package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.model.Product;

@Repository
public interface ProductJPARepository  extends JpaRepository<Product,Integer>
{

}
