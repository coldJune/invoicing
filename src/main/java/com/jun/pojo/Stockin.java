package com.jun.pojo;

import java.io.Serializable;

public class Stockin implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7561479913211277079L;
	private int id;
	private Merchandise merchandise;
	private Client client;
	private Employee employee;
	private String code;
	private float price;
	private int amount;
	private float money;
	private String stockindate;
	public Stockin(){
		
	}
	public Stockin(Merchandise merchandise,Client client,Employee employee,String code,int amount,float price,float money,
			String stockindate){
		this.merchandise=merchandise;
		this.client=client;
		this.employee=employee;
		this.code=code;
		this.amount=amount;
		this.price=price;
		this.money=money;
		this.stockindate=stockindate;
	}
	public void setStockindate(String stockindate){
		if(stockindate!=null&&stockindate.length()>=0){
			stockindate=stockindate.substring(0,10);
		}
		this.stockindate=stockindate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Merchandise getMerchandise() {
		return merchandise;
	}
	public void setMerchandise(Merchandise merchandise) {
		this.merchandise = merchandise;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public float getMoney() {
		return money;
	}
	public void setMoney(float money) {
		this.money = money;
	}
	public String getStockindate() {
		return stockindate;
	}
	
}
