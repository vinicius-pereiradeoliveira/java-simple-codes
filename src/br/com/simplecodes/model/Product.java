package br.com.simplecodes.model;

import java.math.BigDecimal;

public class Product {
	
	private Long id;
	private String name;
	private String description;
	private BigDecimal price;
	private String type;
	
	public Product(Long id, String name, String description, BigDecimal price, String type){
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.type = type;
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

	public String getDescrition() {
		return description;
	}

	public void setDescrition(String descrition) {
		this.description = descrition;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
