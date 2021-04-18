package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.ProductJPARepository;
import com.cg.model.Product;

@Service
public class ProductServiceImpl implements IProductService
{
	@Autowired
	private ProductJPARepository productRepo;

	public List<Product> getAllProducts() {
		return productRepo.findAll();
	}

	public Product findProduct(Integer productId) {
		Optional<Product>prod=productRepo.findById(productId);
		return prod.get();
	}

	public List<Product> deleteProduct(Integer productId) {
		productRepo.deleteById(productId);
		return  productRepo.findAll();
	}

	public List<Product> saveProduct(Product product) {
		productRepo.saveAndFlush(product);

		return  productRepo.findAll();
	}

	public List<Product> updateProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> saveAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
