package com.salestracker.dto;

import javax.persistence.Id;

public class RetailerDTO {
//	@Id
	private int RetailerID;
	private String RetailerName;
	private String RetailerArea;
	private int RetailerContact;
	private int BSNLDemoNo;
	private int ARFoneID;
	private int DealerID;
	private int IsActive;
	
	public int getRetailerID() {
		return RetailerID;
	}
	public void setRetailerID(int retailerID) {
		RetailerID = retailerID;
	}
	public String getRetailerName() {
		return RetailerName;
	}
	public void setRetailerName(String retailerName) {
		RetailerName = retailerName;
	}
	public String getRetailerArea() {
		return RetailerArea;
	}
	public void setRetailerArea(String retailerArea) {
		RetailerArea = retailerArea;
	}
	public int getRetailerContact() {
		return RetailerContact;
	}
	public void setRetailerContact(int retailerContact) {
		RetailerContact = retailerContact;
	}
	public int getBSNLDemoNo() {
		return BSNLDemoNo;
	}
	public void setBSNLDemoNo(int bSNLDemoNo) {
		BSNLDemoNo = bSNLDemoNo;
	}
	public int getARFoneID() {
		return ARFoneID;
	}
	public void setARFoneID(int aRFoneID) {
		ARFoneID = aRFoneID;
	}
	public int getDealerID() {
		return DealerID;
	}
	public void setDealerID(int dealerID) {
		DealerID = dealerID;
	}
	public int getIsActive() {
		return IsActive;
	}
	public void setIsActive(int isActive) {
		IsActive = isActive;
	}
	

}
