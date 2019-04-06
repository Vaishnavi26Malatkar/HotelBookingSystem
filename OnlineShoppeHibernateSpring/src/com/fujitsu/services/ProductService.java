package com.fujitsu.services;
import java.util.List;
import com.fujitsu.beans.Product;
import com.fujitsu.exceptions.ServiceException;
/*
 * Author: Vaishnavi G.Malatkar
 * Creation Date: 27th March 2019
 * Modification Date-2 apr 2019
 * Version: 2.0
 * Copyright: Fujitsu Consulting Pvt ltd. All rights Reserved
 * Description: Bussiness Layer.
 * 
 * */
public interface ProductService {
	
	List<Product> findAllProducts()throws ServiceException;
	Product findById(int productId)throws ServiceException;
	void add(Product product)throws ServiceException;
	void update(Product product)throws ServiceException;
	void remove(Product product)throws ServiceException;
	
	List<Product> sortProductById() throws ServiceException;
	List<Product> sortProductByName() throws ServiceException;
	List<Product> findProductPriceRange(float minPrice, float maxPrice)throws ServiceException;
	List<Product> findProductByBrand(String brand) throws ServiceException;
	
} 
