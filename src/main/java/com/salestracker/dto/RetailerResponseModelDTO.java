package com.salestracker.dto;

import java.util.List;

import javax.persistence.Id;

public class RetailerResponseModelDTO {
//	@Id
	private int DealerID;
	private int RetailerID;
	private String RetailerName;
	private List<TransactionDTO> Transactions;
	
	
	public RetailerResponseModelDTO(int dealerID, int retailerID, String retailerName,
			List<TransactionDTO> transactions) {
		super();
		DealerID = dealerID;
		RetailerID = retailerID;
		RetailerName = retailerName;
		Transactions = transactions;
	}
	public int getDealerID() {
		return DealerID;
	}
	public void setDealerID(int dealerID) {
		DealerID = dealerID;
	}
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
	public List<TransactionDTO> getTransactions() {
		return Transactions;
	}
	public void setTransactions(List<TransactionDTO> transactions) {
		Transactions = transactions;
	}
	

}
