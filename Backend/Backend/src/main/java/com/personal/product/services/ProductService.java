package com.personal.product.services;

import java.util.List;

import javax.validation.Valid;

import com.personal.product.models.Product;
import com.personal.product.models.Status;

public interface ProductService {

	// Fetch products by name, brand, or product code
	public List<Product> fetchProductByProductNameOrBrandOrProductCode(String query);

	// Save a product
	public Product saveProduct(Product product);

	// Show a single product by ID
	public Product showSingleProduct(Long productId);

	// Find a product by product code
	public Product findByProductCode(String productCode);

	// Find all products
	public List<Product> findAll();

	// Add a product
	public Status addProduct(@Valid Product product);

}
