package com.fujitsu.services;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fujitsu.beans.Product;
import com.fujitsu.daos.ProductDAO;
import com.fujitsu.exceptions.ServiceException;
/*
 * Author: Vaishnavi G.Malatkar
 * Creation Date: 27th March 2019
 * Modification Date-2 apr 2019
 * Version: 2.0
 * Copyright: Fujitsu Consulting Pvt ltd. All rights Reserved
 * Description- Service Component Inteface 
 * 				Implementor class of Business Layer
 * 
 * */

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDAO productDao;

	@Override
	public List<Product> findAllProducts() throws ServiceException {
		return productDao.getAllProducts();
	}

	@Override
	public Product findById(int productId) throws ServiceException {
		return productDao.getProductById(productId);
	}

	@Override
	public void add(Product product) throws ServiceException {
		productDao.insert(product);
	}

	@Override
	public void update(Product product) throws ServiceException {
		productDao.update(product);

	}

	@Override
	public void remove(Product product) throws ServiceException {
		productDao.delete(product);
	}

	@Override
	public List<Product> sortProductById() throws ServiceException {
		
		return findAllProducts().stream().sorted().collect(Collectors.toList());
	}

	@Override
	public List<Product> sortProductByName() throws ServiceException {
		
	return findAllProducts().stream().sorted((p1,p2)-> p1.getName().compareTo(p2.getName())).collect(Collectors.toList());
	}

	@Override
	public List<Product> findProductPriceRange(float minPrice, float maxPrice) throws ServiceException {
		
		return findAllProducts().stream().filter(p->p.getPrice()>=minPrice && p.getPrice()<=maxPrice).collect(Collectors.toList());
	}

	@Override
	public List<Product> findProductByBrand(String brand) throws ServiceException {
		// TODO Auto-generated method stub
		return findAllProducts().stream().filter(p->p.getBrand().equals(brand)).collect(Collectors.toList());
	}

}
