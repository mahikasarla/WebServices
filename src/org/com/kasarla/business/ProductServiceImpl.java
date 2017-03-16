package org.com.kasarla.business;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl {
	
	List<String> booksList= new ArrayList<String>();
	List<String> SportsList= new ArrayList<String>();
	List<String> MoviesList= new ArrayList<String>();
	
	public ProductServiceImpl() {
		booksList.add("Kashmora");
		booksList.add("Yendamoori");
		booksList.add("Baahubali");
		
		SportsList.add("Cricket");
		SportsList.add("VolleyBall");
		SportsList.add("FootBall");
		
		MoviesList.add("ThaniOvruvan");
		MoviesList.add("1 Nenokkadine");
		MoviesList.add("Ithe");
	}
	
	public List<String> getProductCategories(){
	List<String> categories = new ArrayList<>();
	categories.add("Books");
	categories.add("Sports");
	categories.add("Movies");
	return categories;
	}
	
	public List<String> getProducts(String category){
		switch(category.toLowerCase()){
		case "books":
			return booksList;
		case "sports":
			return SportsList;
		case "movies":
			return MoviesList;
		}
		return null;
		}
	public boolean addProduct(String category, String product){
		
		switch(category.toLowerCase()){
		case "books":
			return booksList.add(product);
		case "sports":
			return SportsList.add(product);
		case "movies":
			return MoviesList.add(product);
		}
		return true;
	}
}
