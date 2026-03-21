package com.mphasis.productmanagerapp.service;

import java.util.List;

import com.mphasis.productmanagerapp.dao.ProductDAO;
import com.mphasis.productmanagerapp.model.ProductModel;

public class ProductService {
	/*private List<ProductModel> products = new ArrayList<>();
	public ProductService() {
		products.add(new ProductModel("p1","pen",100));
		products.add(new ProductModel("p1","marker",200));
		products.add(new ProductModel("p1","mouse",400));

	}*/
	private ProductDAO productDAO = new ProductDAO();
	public List<ProductModel>getAllProducts(){
		//return products;
		return productDAO.findall();
	}
	public int saveProduct(ProductModel product) {
		return productDAO.save(product);
	}

}
