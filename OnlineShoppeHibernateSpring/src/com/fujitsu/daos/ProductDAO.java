package com.fujitsu.daos;

import java.util.List;
import com.fujitsu.beans.Product;
/*
 * Author: Vaishnavi G. Malatkar.
 * Company Name: Fujitsu 
 * Creation Date:19/3/2019 (DD/MM/YYYY)
 * Modification Date:2/4/2019 (DD/MM/YYYY)
 * Version:3.0
 * Description: It represent DAO iNTERFACE 
 * iT Contains CRUD Operation methods
 * It is java bean class
 * */
//DAO Interface - DAO Design Pattern
//Contains CRUD Operation methods

public interface ProductDAO {
	

	List<Product> getAllProducts();
	Product getProductById(int productId);
	
	void insert(Product name);
	void update(Product product);
	void delete(Product product);
	
}
