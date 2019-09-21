package com.salestracker.dto;

import java.util.List;
import java.util.Date;

public class TransactionDTO {
	
	private int TransactionID;
	private Date Date;
	private int Ammount;
	private int IsActive;
	private List<TransactionDetailsDTO> TransactionDetails;
	
	public int getTransactionID() {
		return TransactionID;
	}
	public void setTransactionID(int transactionID) {
		TransactionID = transactionID;
	}
	public Date getDate() {
		return Date;
	}
	public List<TransactionDetailsDTO> getTransactionDetails() {
		return TransactionDetails;
	}
	public void setTransactionDetails(List<TransactionDetailsDTO> transactionDetails) {
		TransactionDetails = transactionDetails;
	}
	public void setDate(Date date) {
		Date = date;
	}
	public int getAmmount() {
		return Ammount;
	}
	public void setAmmount(int ammount) {
		Ammount = ammount;
	}
	public int getIsActive() {
		return IsActive;
	}
	public void setIsActive(int isActive) {
		IsActive = isActive;
	}
	
}
