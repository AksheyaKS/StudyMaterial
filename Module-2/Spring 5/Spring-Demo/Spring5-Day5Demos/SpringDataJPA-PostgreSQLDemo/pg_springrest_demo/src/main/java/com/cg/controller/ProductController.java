package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Product;
import com.cg.model.ProductDTO;
import com.cg.service.ProductService;

@RestController//@controller+@responsebody
//@RequestMapping("/products")
public class ProductController {
	@Autowired
	ProductService service;
	

	@GetMapping(value="products",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity getProducts(){
		//Product p = new Product();
		List<ProductDTO> plist = service.getProducts();
		//return service.getProducts();
		ResponseEntity response = new ResponseEntity(plist, HttpStatus.OK);
		return response;
	}
	
	@GetMapping(value="products/{pid}")///name/{pname}")
	public ResponseEntity getProductbyId(@PathVariable("pid")int pid) throws ProductNotFoundException{//, @PathVariable("pname") String name) {
		//System.out.println("name "+name);
		ProductDTO p=service.getProductById(pid);
		return new ResponseEntity(p, HttpStatus.OK);
	}
	
	@PostMapping(value="products")
	public ResponseEntity addProduct(@RequestBody ProductDTO productdto) {
		service.addProduct(productdto);
		return new ResponseEntity("product added successfully!", HttpStatus.OK);
	}
	
}
