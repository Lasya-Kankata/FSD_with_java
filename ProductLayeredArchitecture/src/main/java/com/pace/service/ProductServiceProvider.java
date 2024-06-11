package com.pace.service;
import java.util.ArrayList;

import com.pace.ProductDAO.ProductDAO;
import com.pace.bean.Product;
public class ProductServiceProvider {
	private ProductDAO productDAO=new ProductDAO();

	public void addDetails(Product product) {
	productDAO.addDetails(product);
	}

	public ArrayList<Product> sendDetails(){
	return productDAO.sendDetails();
	}
}
