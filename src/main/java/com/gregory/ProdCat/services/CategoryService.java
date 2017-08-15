package com.gregory.ProdCat.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gregory.ProdCat.models.Category;
import com.gregory.ProdCat.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	private CategoryRepository categoryRepository;
	
	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	public List<Category> allCategories(){
		return (List<Category>) categoryRepository.findAll();
	}
	
	public void addCategory(Category category) {
		categoryRepository.save(category);
	}
	public Category findCategoryById(Long id) {
		Category cat = categoryRepository.findOne(id);
		return cat;
	}

	public CategoryRepository getCategoryRepository() {
		return categoryRepository;
	}

	public void setCategoryRepository(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	
	
}
