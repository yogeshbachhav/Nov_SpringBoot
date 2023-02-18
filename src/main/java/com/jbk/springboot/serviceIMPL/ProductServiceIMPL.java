package com.jbk.springboot.serviceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.springboot.dao.ProductDao;
import com.jbk.springboot.model.Product;
import com.jbk.springboot.service.ProductService;

@Service
public class ProductServiceIMPL implements ProductService {

//	ProductDao dao = new ProductDaoIMPL();

	@Autowired
	private ProductDao dao;

	@Override
	public boolean saveProduct(Product product) {
		boolean isAdded = dao.saveProduct(product);
		return isAdded;
	}

	@Override
	public List<Product> getProducts() {
		List<Product> products = dao.getProducts();
		return products;
	}

	@Override
	public Product getProductById(long productById) {
		Product product = dao.getProductById(productById);
		return product;
	}

	@Override
	public boolean deleteProduct(long id) {
		boolean isDeleted = dao.deleteProduct(id);
		return isDeleted;
	}

	@Override
	public List<Product> sortProductById_ASC() {
		List<Product> sortProductById_ASC = dao.sortProductById_ASC();
		return sortProductById_ASC;
	}

	@Override
	public List<Product> sortProductById_DESC() {
		List<Product> sortProductById_DESC = dao.sortProductById_DESC();
		return sortProductById_DESC;
	}

	@Override
	public Product getMaxPriceProduct() {
		Product maxPriceProduct = dao.getMaxPriceProduct();
		return maxPriceProduct;
	}

	@Override
	public Double countSumOfProductPrice() {
		Double countSumOfProductPrice = dao.countSumOfProductPrice();
		return countSumOfProductPrice;
	}

	@Override
	public long getTotalCountOfProduct() {
		long totalCountOfProduct = dao.getTotalCountOfProduct();
		return totalCountOfProduct;
	}
}
