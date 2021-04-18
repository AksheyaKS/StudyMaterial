package com.cg.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.cg.model.Product;

@RepositoryRestResource(collectionResourceRel="cgProducts",path="pathProducts")
public interface ProductJPARepository  extends JpaRepository<Product,Integer>
{	
	public Product findByProductName(@Param("pnm") String prodName);
	@Query("SELECT prod FROM Product prod  WHERE prod.price>=:pri")
	public List<Product> getByPrice(@Param("pri") double price);

}
