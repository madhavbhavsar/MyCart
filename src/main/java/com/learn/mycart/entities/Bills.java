package com.learn.mycart.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bills {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length=10,name="bill_id")
	private int billId;

	
	@Column(length=100,name="bill_name")
	private String billName;
	
	@Column(length=1500,name="bill_items_names")
	private String billItems;
	
	@Column(length=1500,name="bill_items_quantity")
	private String billItemsQuantity;
	
	@Column(length=1500,name="bill_items_price")
	private String billItemsPrice;
	
	@Column(length=1500,name="bill_items_tprice")
	private String billItemsTprice;
	
	@Column(length=100,name="bill_email")
	private String billEmail;
	
	@Column(length=12,name="bill_phone")
	private String billPhone;
	
	@Column(length=1500,name="bill_add")
	private String billAdd;
	
	public Bills(int billId,String billName, String billEmail, String billAdd, String billPhone,String billItems, String billItemsQuantity,String billItemsPrice,String billItemsTprice ) {
		super();
		this.billId = billId;
		this.billPhone = billPhone;
		this.billName = billName;
		this.billEmail = billEmail;
		this.billAdd = billAdd;
		this.billItems = billItems;
		this.billItemsQuantity = billItemsQuantity;
		this.billItemsPrice = billItemsPrice;
		this.billItemsTprice = billItemsTprice ;
		
		
	}
	
	public Bills(String billName, String billEmail, String billAdd, String billPhone,String billItems, String billItemsQuantity,String billItemsPrice,String billItemsTprice) {
		super();
		this.billPhone = billPhone;
		this.billName = billName;
		this.billEmail = billEmail;
		this.billAdd = billAdd;
		this.billItems = billItems;
		
		this.billItemsQuantity = billItemsQuantity;
		this.billItemsPrice = billItemsPrice;
		this.billItemsTprice = billItemsTprice ;
		
	}
	
	public Bills() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getBillItemsQuantity() {
		return billItemsQuantity;
	}

	public void setBillItemsQuantity(String billItemsQuantity) {
		this.billItemsQuantity = billItemsQuantity;
	}

	public String getBillItemsPrice() {
		return billItemsPrice;
	}

	public void setBillItemsPrice(String billItemsPrice) {
		this.billItemsPrice = billItemsPrice;
	}

	public String getBillItemsTprice() {
		return billItemsTprice;
	}

	public void setBillItemsTprice(String billItemsTprice) {
		this.billItemsTprice = billItemsTprice;
	}

	public int getBillId() {
		return billId;
	}


	public void setBillId(int billId) {
		this.billId = billId;
	}


	public String getBillName() {
		return billName;
	}


	public void setBillName(String billName) {
		this.billName = billName;
	}
	
	public String getBillItems() {
		return billItems;
	}


	public void setBillItems(String billItems) {
		this.billItems = billItems;
	}


	public String getBillEmail() {
		return billEmail;
	}


	public void setBillEmail(String billEmail) {
		this.billEmail = billEmail;
	}


	public String getBillPhone() {
		return billPhone;
	}


	public void setBillPhone(String billPhone) {
		this.billPhone = billPhone;
	}


	public String getBillAdd() {
		return billAdd;
	}


	public void setBillAdd(String billAdd) {
		this.billAdd = billAdd;
	}

	
	
}


