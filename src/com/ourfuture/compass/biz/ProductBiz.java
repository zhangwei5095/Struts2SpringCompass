package com.ourfuture.compass.biz;

import java.util.List;

import com.ourfuture.compass.model.Product;

public interface ProductBiz {
	
	boolean save(Product product);
	
	boolean update(Product product);
	
	boolean delete(Product product);
	
	Product get(int id);
	
	List<Product> listAll(int pageNumber,int pageSize);
	
	/**
	 * 用于compass搜索的
	 * @param queryString
	 * @return
	 */
	List search(String queryString);
}
