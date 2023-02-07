package com.learn.mycart.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Bills {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Bid;
	private int userId;
	private int BtotalQuantity;
	private int BtotalProduct;
	private int BtotalPrice;
	
	public Bills(int bid, int btotalQuantity, int btotalProduct, int btotalPrice,int userId) {
		super();
		this.Bid = bid;
		this.BtotalQuantity = btotalQuantity;
		this.BtotalProduct = btotalProduct;
		this.BtotalPrice = btotalPrice;
		this.userId = userId;
	}
	
	public Bills() {
		super();
		
	}
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getBid() {
		return Bid;
	}
	public void setBid(int bid) {
		Bid = bid;
	}
	public int getBtotalQuantity() {
		return BtotalQuantity;
	}
	public void setBtotalQuantity(int btotalQuantity) {
		BtotalQuantity = btotalQuantity;
	}
	public int getBtotalProduct() {
		return BtotalProduct;
	}
	public void setBtotalProduct(int btotalProduct) {
		BtotalProduct = btotalProduct;
	}
	public int getBtotalPrice() {
		return BtotalPrice;
	}
	public void setBtotalPrice(int btotalPrice) {
		BtotalPrice = btotalPrice;
	}
	

	
	
}


