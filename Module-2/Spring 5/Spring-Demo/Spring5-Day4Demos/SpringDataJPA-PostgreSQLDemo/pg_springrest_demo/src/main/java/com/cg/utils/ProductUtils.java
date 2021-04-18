package com.cg.utils;

import java.util.ArrayList;
import java.util.List;

import com.cg.entity.Product;
import com.cg.model.ProductDTO;

public class ProductUtils {
	public static List<ProductDTO> convertToProductDtoList(List<Product> list){
		List<ProductDTO> dtolist = new ArrayList<ProductDTO>();
		for(Product product : list) 
			dtolist.add(convertToProductDto(product));
		return dtolist;
	}
	
	public static Product convertToProduct(ProductDTO productdto) {
		Product product = new Product();
		product.setPrice(productdto.getPrice());
		product.setProductId(productdto.getProductId());
		product.setProductName(productdto.getProductName());
		return product;
	}
	
	
		
		public static ProductDTO convertToProductDto(Product product) {
			ProductDTO productdto = new ProductDTO();
			productdto.setPrice(product.getPrice());
			productdto.setProductId(product.getProductId());
			productdto.setProductName(product.getProductName());
			return productdto;
		}
		
	

}
