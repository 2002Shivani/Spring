package com.entities;

import java.beans.JavaBean;

import org.springframework.beans.factory.annotation.Value;


public class ProductSelling {
	
	@Value("30")
	private int profit;
	@Value("10")
	private int loss;
	@Value("100")
	private int price;
	
	public ProductSelling() {
		
	}

	public ProductSelling(int profit, int loss, int price) {
		super();
		this.profit = profit;
		this.loss = loss;
		this.price = price;
	}

	public int getProfit() {
		return profit;
	}

	public void setProfit(int profit) {
		this.profit = profit;
	}

	public int getLoss() {
		return loss;
	}

	public void setLoss(int loss) {
		this.loss = loss;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductSelling [profit=" + profit + "%, loss=" + loss + "%, price=" + price + "Rs ]";
	}
	

}
