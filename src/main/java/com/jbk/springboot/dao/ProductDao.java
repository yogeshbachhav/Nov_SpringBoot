package com.jbk.springboot.dao;

import java.util.List;

import com.jbk.springboot.model.Product;

public interface ProductDao {

	public boolean saveProduct(Product product);

	public List<Product> getProducts();

	public boolean deleteProduct(long id);

	public Product getProductById(long productById);

	public List<Product> sortProductById_ASC();

	public List<Product> sortProductById_DESC();

	public Product getMaxPriceProduct();

	public Double countSumOfProductPrice();

	public long getTotalCountOfProduct();
}
