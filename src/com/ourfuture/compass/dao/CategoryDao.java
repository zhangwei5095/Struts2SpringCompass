package com.ourfuture.compass.dao;

import java.util.List;

import com.ourfuture.compass.model.Category;

public interface CategoryDao {

	boolean save(Category category);
	
	boolean update(Category category);
	
	boolean delete(Category category);
	
	Category get(int id);
	
	List<Category> listAll(int pageNumber,int pageSize);
	
	List<Category> listAll();
}
