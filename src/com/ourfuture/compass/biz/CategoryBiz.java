package com.ourfuture.compass.biz;

import java.util.List;

import com.ourfuture.compass.model.Category;

public interface CategoryBiz {
	
	boolean save(Category category);
	
	boolean update(Category category);
	
	boolean delete(Category category);
	
	Category get(int id);
	
	List<Category> listAll(int pageNumber,int pageSize);
	
	
	List<Category> listAll();
	
	/**
	 * 用于compass搜索的
	 * @param queryString
	 * @return
	 */
	List<Category> search(String queryString);
}
