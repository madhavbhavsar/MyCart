package com.learn.mycart.entities;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;
import javax.persistence.Id;

public class BillDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int BDid;
	private int Pid;
	private int OrdQuantity;
	private int BDprice;
	private Bills bills;
	
	
	
	public BillDetail() {
		super();
	}
	
	

	public BillDetail(int BDid, int pid, int ordQuantity, int bDprice, Bills bills) {
		super();
		this.BDid = BDid;
		this.Pid = pid;
		this.OrdQuantity = ordQuantity;
		this.BDprice = bDprice;
		this.bills = bills;
	}



	public Bills getBills() {
		return bills;
	}



	public void setBills(Bills bills) {
		this.bills = bills;
	}



	public int getBDprice() {
		return BDprice;
	}

	public void setBDprice(int bDprice) {
		BDprice = bDprice;
	}

	public int getBDid() {
		return BDid;
	}

	public void setBDid(int bDid) {
		BDid = bDid;
	}

	public int getPid() {
		return Pid;
	}

	public void setPid(int pid) {
		Pid = pid;
	}

	public int getOrdQuantity() {
		return OrdQuantity;
	}

	public void setOrdQuantity(int ordQuantity) {
		OrdQuantity = ordQuantity;
	}
	
	
	
	

}
