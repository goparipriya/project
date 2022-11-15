package com.cg.onlinevegetablessales.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vegetables {
	@Id
	private int vegId;
	private String vegName;
	private double vegPrice;
	public int getVegId() {
		return vegId;
	}
	public void setVegId(int vegId) {
		this.vegId = vegId;
	}
	public String getVegName() {
		return vegName;
	}
	public void setVegName(String vegName) {
		this.vegName = vegName;
	}
	public double getVegPrice() {
		return vegPrice;
	}
	public void setVegPrice(double vegPrice) {
		this.vegPrice = vegPrice;
	}

}
