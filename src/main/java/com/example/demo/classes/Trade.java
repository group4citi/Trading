package com.example.demo.classes;

import java.util.Date;

public class Trade {
	private Date dateCreated;
	private String tradeID;
	private String stockTicker;
	private int quantity;
	private double price;
	public Trade( String stockTicker, int quantity, double price) {
		this.dateCreated = new Date();
		this.stockTicker = stockTicker;
		this.quantity = quantity;
		this.price = price;
	}
	
	public Date getDate() {
		return dateCreated;
	}
	public void setDate(Date date) {
		this.dateCreated = date;
	}
	public String getStockTicker() {
		return stockTicker;
	}
	public void setStockTicker(String stockTicker) {
		this.stockTicker = stockTicker;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
