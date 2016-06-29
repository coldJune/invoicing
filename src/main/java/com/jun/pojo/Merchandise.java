package com.jun.pojo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Merchandise implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4086288824216884174L;
	private int id;
	private String code;
	private String name;
	private float price;
	private Set stockins = new HashSet(0);
	private Set stockorders = new HashSet(0);
	public Merchandise(){
		
	}
	public Merchandise(String code,String name,float price){
		this.code=code;
		this.name=name;
		this.price=price;
	}
	public Merchandise(String code,String name,float price,Set stockins,Set stockorders){
		this.code=code;
		this.name=name;
		this.price=price;
		this.stockins=stockins;
		this.stockorders=stockorders;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Set getStockins() {
		return stockins;
	}
	public void setStockins(Set stockins) {
		this.stockins = stockins;
	}
	public Set getStockorders() {
		return stockorders;
	}
	public void setStockorders(Set stockorders) {
		this.stockorders = stockorders;
	}
	
}
