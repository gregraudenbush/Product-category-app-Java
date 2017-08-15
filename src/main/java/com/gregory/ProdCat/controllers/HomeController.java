package com.gregory.ProdCat.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gregory.ProdCat.models.Category;
import com.gregory.ProdCat.models.Product;
import com.gregory.ProdCat.services.CategoryService;
import com.gregory.ProdCat.services.ProductService;

@Controller
public class HomeController {

	private ProductService productService;
	private CategoryService categoryService;
	
	public HomeController(ProductService productService,CategoryService categoryService) {
		this.productService = productService;
		this.categoryService = categoryService;
	}
	
	@RequestMapping("/")
	public String index(Model model) {
		List<Product> products = productService.allProduct();
		List<Category> categories = categoryService.allCategories();
		model.addAttribute("products", products);
		model.addAttribute("categories", categories);
		return "index.jsp";
	}
	
	@RequestMapping("/products/new")
	public String productnew(@ModelAttribute("product") Product product) {
		
		
		return "newproduct.jsp";
	}
	
	@PostMapping("/products/newform")
	public String newformproduct(@Valid @ModelAttribute("product")Product product, BindingResult result, Model model) {
		if(result.hasErrors()) {
			
		
			return "newproduct.jsp";
		}else {
			System.out.println(product.getName());
			productService.addProduct(product);
			return "redirect:/";
		}
	}
	
	@RequestMapping("/category/new")
	public String categorynew(@ModelAttribute("category") Category category) {
		
		return "newcategory.jsp";
	}
	
	@PostMapping("/category/newform")
	public String newformcategory(@Valid @ModelAttribute("category")Category category, BindingResult result, Model model) {
		if(result.hasErrors()) {
			
		
			return "newcategory.jsp";
		}else {
			
			categoryService.addCategory(category);
			return "redirect:/";
		}
	}
	@RequestMapping("/product/{id}")
	public String product(@PathVariable("id") Long id, Model model) {
		Product product = productService.findProductById(id);
		List<Category> categories = categoryService.allCategories();
		model.addAttribute("categories", categories);
		model.addAttribute("product", product);
		
		return "product.jsp";
	}
	@PostMapping("/product/{id}/new")
	public String addCategory(@PathVariable("id")Long id, @RequestParam(value="category") Long catId, Model model) {
		productService.addCategoryToProduct(catId, id);
		
		Product product = productService.findProductById(id);
		List<Category> categories = categoryService.allCategories();
		model.addAttribute("categories", categories);
		model.addAttribute("product", product);
		
		return "product.jsp";
	}
	
	@RequestMapping("/category/{id}")
	public String category(@PathVariable("id") Long id, Model model) {
		Category category = categoryService.findCategoryById(id);
		List<Product> products = productService.allProduct();
		
		model.addAttribute("category", category);
		model.addAttribute("products", products);
		
		return "product.jsp";
	}
	@PostMapping("/category/{id}/new")
	public String addProduct(@PathVariable("id")Long id, @RequestParam(value="product") Long catId, Model model) {
		productService.addCategoryToProduct(id, catId);
		
		
		Category category = categoryService.findCategoryById(id);
		List<Product> products = productService.allProduct();
		model.addAttribute("category", category);
		model.addAttribute("products", products);
		
		
		return "category.jsp";
	}
	
}
