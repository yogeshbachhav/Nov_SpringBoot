package com.jbk.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.springboot.model.Product;
import com.jbk.springboot.service.ProductService;

@RestController
public class ProductController {

//	ProductService service = new ProductServiceIMPL();

	@Autowired
	ProductService service;

	@PostMapping("saveProduct")
	public boolean saveProduct(@RequestBody Product product) {
		boolean isAdded = service.saveProduct(product);
		return isAdded;
	}

	@GetMapping("getAllProduct")
	public List<Product> getAllProducts() {
		List<Product> products = service.getProducts();
		return products;
	}

	@GetMapping(value = "/getProductById/{productId}")
	public Product getProductById(@PathVariable("productId") long productId) {
		Product product = service.getProductById(productId);
		return product;
	}

	@DeleteMapping("delete-by-id/{id}")
	public boolean deleteProduct(@PathVariable long id) {
		boolean isDeleted = service.deleteProduct(id);
		return isDeleted;
	}

	@GetMapping("/get-maximumPriceProduct")
	public Product getMaxPriceProduct() {
		Product maximumPriceProduct = service.getMaxPriceProduct();
		return maximumPriceProduct;

	}

	@GetMapping("/sort-productById-Asc")
	public List<Product> sortProductById_ASC() {
		List<Product> sortProductById_ASC = service.sortProductById_ASC();
		return sortProductById_ASC;

	}

	@GetMapping("/sort-productById-Desc")
	public List<Product> sortProductById_DESC() {
		List<Product> sortProductById_DESC = service.sortProductById_DESC();
		return sortProductById_DESC;

	}

	@GetMapping("/total-sumfProduct-Price")
	public Double countSumOfProductPrice() {
		Double countSumOfProductPrice = service.countSumOfProductPrice();
		return countSumOfProductPrice;

	}

	@GetMapping("/get-totalCountof-Product")
	public Long getTotalCountOfProduct() {
		Long totalCountOfProduct = service.getTotalCountOfProduct();
		System.out.println(totalCountOfProduct);
		return totalCountOfProduct;

	}
}
