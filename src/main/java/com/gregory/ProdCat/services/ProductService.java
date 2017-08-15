package com.gregory.ProdCat.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gregory.ProdCat.models.Product;
import com.gregory.ProdCat.repositories.CategoryRepository;
import com.gregory.ProdCat.repositories.ProductRepository;

@Service
public class ProductService {
	private ProductRepository productRepository;
	private CategoryRepository categoryRepository;
	public ProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {
		this.productRepository = productRepository;
		this.categoryRepository = categoryRepository;
	}
	
	public List<Product> allProduct(){
		return (List<Product>) productRepository.findAll();
	}
	
	public Product findProductById(Long id) {
		Product product = productRepository.findOne(id);
		return product;
	}
	
	public void addProduct(Product product) {
		productRepository.save(product);
	}
	
	public ProductRepository getProductRepository() {
		return productRepository;
	}
	public void addCategoryToProduct(Long cateId, Long id) {
		Product product = productRepository.findOne(id);
		product.getCategories().add(categoryRepository.findOne(cateId));
		productRepository.save(product);
	}
	

}
