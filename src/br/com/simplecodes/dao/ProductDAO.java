package br.com.simplecodes.dao;

import java.math.BigDecimal;
import java.util.ArrayList;

import br.com.simplecodes.model.Product;

public class ProductDAO {
	
	// ArrayList method that find all products
	public ArrayList<Product> products(){
		
		ArrayList<Product> p = new ArrayList<Product>();// variable of return
		
		// create objects Product
		Product p1 = new Product(123L, "Nescau", "500g pequeno", new BigDecimal(8.95), "UN");
		Product p2 = new Product(124L, "Nescau", "1000g grande", new BigDecimal(11.95), "UN");
		Product p3 = new Product(125L, "Arroz", "500g médio", new BigDecimal(7.95), "UN");
		Product p4 = new Product(126L, "feijão", "500g médio", new BigDecimal(9.95), "UN");
		
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		
		return p;
	}
	
	// method type Product Object that find a specific object
	public Product findOneProduct(){
		Product find_product = new Product(123L, "Nescau", "500g pequeno", new BigDecimal(8.95), "UN");
		return find_product;
	}
}
