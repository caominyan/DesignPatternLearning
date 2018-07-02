package com.inhome.iteratorpattern;

public class MenuItem {

	private int id;
	
	private int price;
	
	private String name;
	
	private boolean isRecommand;

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isRecommand() {
		return isRecommand;
	}

	public void setRecommand(boolean isRecommand) {
		this.isRecommand = isRecommand;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("[").append(id)
		.append(",").append(name).append(",")
		.append(price).append("]");
		return stringBuilder.toString();
	}
	
	
}
