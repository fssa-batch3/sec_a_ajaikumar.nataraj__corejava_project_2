package com.fssa.rishi.services;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.fail;

import java.sql.Date;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.fssa.rishi.model.ProductDetails;
import com.fssa.rishi.services.exceptions.ServiceException;

 class TestUpdateProductFeature {

	@Test 
	void testUpdateProductSuccess() throws ServiceException {
		LocalDate uploadDate = LocalDate.now();
		long id = 1693807515608L;
		long seller_id = 1693567910255L;

		ProductDetails product = new ProductDetails(id, "Orange", 40, 30, "It is a nice product", null, "Trichy",
				"Fruit", "Gobi", seller_id, 456789, uploadDate);

		ProductService productService = new ProductService();
		try {
			productService.updateProduct(product);
		} catch (ServiceException e) {  
			e.printStackTrace();
			fail();
		}   
	}  
 
	
	@Test
	void testInavalidUpdateFailures() {
		ProductService productService = new ProductService();
		LocalDate uploadDate = LocalDate.now();

		ProductDetails invalidProduct = new ProductDetails(00000000000, "74t677", -10, -50,
				"Invalid product description", null, "8978656756", "good fruit", "767ghjbygfyug7647", 987654321, 456789,
				uploadDate);

		try {
			assertFalse(productService.updateProduct(invalidProduct));
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}

}
