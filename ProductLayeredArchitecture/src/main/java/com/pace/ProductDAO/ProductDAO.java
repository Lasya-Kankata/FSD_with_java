package com.pace.ProductDAO;

import java.util.ArrayList;

import com.pace.bean.Product;

public class ProductDAO {
		ArrayList<Product> productList=new ArrayList<Product>();

		public void addDetails(Product product) {
		productList.add(product);
		}
		public ArrayList<Product> sendDetails(){
		return productList;
		}
}
