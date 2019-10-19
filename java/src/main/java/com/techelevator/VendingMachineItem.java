package com.techelevator;

import java.math.BigDecimal;

public abstract class VendingMachineItem {
	private String name;
	private BigDecimal price;
	private String slotIdentifier;
	private Integer stock = 5;
	private String type;
	private String purchaseMessage;
	
	public VendingMachineItem(String name, BigDecimal price, String slotIdentifier) {
		this.name = name;
		this.price = price;
		this.slotIdentifier = slotIdentifier;
	}

	public String getName() {
		return name;
	}


	public BigDecimal getPrice() {
		return price;
	}

	public String getSlotIdentifier() {
		return slotIdentifier;
	}


	public Integer getStock() {
		return stock;
	}

	public void setStock(int stock) {
		if(stock>5 || stock<0) {
			System.out.println("Invalid Stock Amount");
		} else {
			this.stock = stock;			
		}
	}
	
	public abstract String getPurchaseMessage();
}
