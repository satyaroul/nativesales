package com.salestracker.dto;

public class TransactionDetailsDTO {
	
	private int ItemID;
	private String ItemName;
	private int Rate;
	private int IndAmmount;
	
	
	public TransactionDetailsDTO(int itemID, String itemName, int rate, int indAmmount) {
		super();
		ItemID = itemID;
		ItemName = itemName;
		Rate = rate;
		IndAmmount = indAmmount;
	}
	public int getItemID() {
		return ItemID;
	}
	public void setItemID(int itemID) {
		ItemID = itemID;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public int getRate() {
		return Rate;
	}
	public void setRate(int rate) {
		Rate = rate;
	}
	public int getIndAmmount() {
		return IndAmmount;
	}
	public void setIndAmmount(int indAmmount) {
		IndAmmount = indAmmount;
	}
	
	

}
