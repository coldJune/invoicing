package com.jun.pojo;

import java.io.Serializable;

public class Stockorder implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2576793320919098564L;
	private int id;
	private Employee employee;
	private Merchandise merchandise;
	private Client client;
	private String code;
	private int merchandisenumber;
	private String orderdate;
	public Stockorder(){
		
	}
	public Stockorder(Employee employee,Merchandise merchandise,Client client,String code,int merchandisenumber,String orderdate){
		this.employee=employee;
		this.merchandise=merchandise;
		this.client=client;
		this.code=code;
		this.merchandisenumber=merchandisenumber;
		this.orderdate=orderdate;
	}
	public void setOrderdate(String orderdate){
		if(orderdate!=null&&orderdate.length()>=10){
			orderdate=orderdate.substring(0,10);
		}
		this.orderdate=orderdate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getMerchandisenumber() {
		return merchandisenumber;
	}
	public void setMerchandisenumber(int merchandisenumber) {
		this.merchandisenumber = merchandisenumber;
	}
	public String getOrderdate() {
		return orderdate;
	}
	
}
