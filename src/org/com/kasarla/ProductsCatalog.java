package org.com.kasarla;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import org.com.kasarla.business.ProductServiceImpl;

@WebService
public class ProductsCatalog {
	
	ProductServiceImpl productService = new ProductServiceImpl();
	
	@WebMethod
	public List<String> getProductCategories(){
		return productService.getProductCategories();
		
	}
	@WebMethod
	public List<String> getProducts(String category){
		return productService.getProducts(category);
		
	}
	@WebMethod
	public boolean addProduct(String category,String product){
		return productService.addProduct(category, product);
		
	}
}
