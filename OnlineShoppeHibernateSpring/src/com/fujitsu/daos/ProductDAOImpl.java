package com.fujitsu.daos;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.fujitsu.beans.Product;
/*
 * Author: Vaishnavi G. Malatkar.
 * Company Name: Fujitsu 
 * Creation Date:19/3/2019 (DD/MM/YYYY)
 * Modification Date:2/4/2019 (DD/MM/YYYY)
 * Version:6.0
 * Description: It represent DAO iNTERFACE 
 * iT Contains CRUD Operation methods implementation.
 * It connects with database and perform SQL operation
 * 
 * */
@Repository
@Transactional
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(Product.class);
	}

	@Override
	public Product getProductById(int productId) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Product.class, productId);
	}

	@Override
	public void insert(Product p) {
		hibernateTemplate.save(p);
		
	}

	@Override
	public void update(Product product2) {
		hibernateTemplate.update(product2);
		
	}

	@Override
	public void delete(Product product) {
		hibernateTemplate.delete(product);
		
	}

	
}
