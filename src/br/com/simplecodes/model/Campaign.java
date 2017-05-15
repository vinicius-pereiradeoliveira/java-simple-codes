package br.com.simplecodes.model;

import java.util.ArrayList;

public class Campaign {
	
	private Long id;
	private String name;
	private Company nameCompany;
	private ArrayList<Product> product;
	
	public Campaign(Long id, String name, Company nameCompany, ArrayList<Product> product) {
		this.id = id;
		this.name = name;
		this.nameCompany = nameCompany;
		this.product = product;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Company getNameCompany() {
		return nameCompany;
	}

	public void setNameCompany(Company nameCompany) {
		this.nameCompany = nameCompany;
	}

	public ArrayList<Product> getProduct() {
		return product;
	}

	public void setProduct(ArrayList<Product> product) {
		this.product = product;
	}
}
