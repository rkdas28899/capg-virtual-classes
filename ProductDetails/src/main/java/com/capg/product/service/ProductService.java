package com.capg.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.moviecatelog.model.MovieCatelog;
import com.capg.product.model.Product;
import com.capg.product.repo.ProductRepo;
@Service
public class ProductService {
	@Autowired
	private  ProductRepo  repo;
	
	public List<Product> findAllProducts() { 
		return repo.findAll();
	}
	
	public Product getProduct(int id) {
		return repo.getOne(id);
	}

	public Product createProduct(Product product) {
		return repo.saveAndFlush(product);
	}
 
}
