package com.niit.Cargo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.Cargo.model.Product;

@Repository
public class ProductDaoimpl implements ProductDao{

	@Override
	public void addProduct(Product p) {
		
	}

	@Override
	public void updateProduct(Product p) {
		
	}

	@Override
	public List<Product> listProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeProduct(int id) {
		// TODO Auto-generated method stub
		
	}
//private static final Logger logger=
//LoggerFactory.getLogger(ProductDaoimpl.class);

//private SessionFactory sessionFactory;
//
//public void setSessionFactory(SessionFactory sf) {
//	this.sessionFactory=sf;
//}
	
}
