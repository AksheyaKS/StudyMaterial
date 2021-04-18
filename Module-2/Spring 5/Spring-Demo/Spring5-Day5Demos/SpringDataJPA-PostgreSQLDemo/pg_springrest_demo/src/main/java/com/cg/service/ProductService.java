package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.controller.ProductNotFoundException;
import com.cg.entity.Product;
import com.cg.model.ProductDTO;
import com.cg.repository.ProductRepository;
import com.cg.utils.ProductUtils;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository repo;
	
	public List<ProductDTO> getProducts() {
		List<Product> plist= repo.findAll();
		List<ProductDTO>dtolist=ProductUtils.convertToProductDtoList(plist);
		System.out.println("service list size "+plist.size());
		return dtolist;
	}
	public ProductDTO getProductById(int id) throws ProductNotFoundException {
		Optional<Product> optional= repo.findById(id);
		if(optional.isPresent()) {
			Product product= optional.get();
			return ProductUtils.convertToProductDto(product);
		}
		else {
			throw new ProductNotFoundException("Product not found for the given id");
			
		}
			
			
		
	}
	public void addProduct(ProductDTO productdto) {
		repo.saveAndFlush(ProductUtils.convertToProduct(productdto));
	}

}
