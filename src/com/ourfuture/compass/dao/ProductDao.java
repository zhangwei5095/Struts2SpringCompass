package com.ourfuture.compass.dao;

import java.util.List;

import com.ourfuture.compass.model.Product;

public interface ProductDao {
	
	boolean save(Product product);
	
	boolean update(Product product);
	
	boolean delete(Product product);
	
	Product get(int id);
	
	List<Product> listAll(int pageNumber,int pageSize);
	
}
