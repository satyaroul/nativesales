package com.salestracker.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Dealer_Master")
public class DealerDTO {
	@Id
	private int DealerIdPk;
	private String DealerName;
	private int DealerNumber;
	private String DealerArea;
	private String DealerLoginId;
	private String DealerPassword;
	private int IsActive;
	
	
	public String getDealerName() {
		return DealerName;
	}
	public void setDealerName(String dealerName) {
		DealerName = dealerName;
	}
	public int getDealerNumber() {
		return DealerNumber;
	}
	public int getDealerIdPk() {
		return DealerIdPk;
	}
	public void setDealerIdPk(int dealerID_PK) {
		DealerIdPk = dealerID_PK;
	}
	public String getDealerPassword() {
		return DealerPassword;
	}
	public void setDealerPassword(String dealerPassword) {
		DealerPassword = dealerPassword;
	}
	public void setDealerNumber(int dealerNumber) {
		DealerNumber = dealerNumber;
	}
	public String getDealerArea() {
		return DealerArea;
	}
	public void setDealerArea(String dealerArea) {
		DealerArea = dealerArea;
	}
	public String getDealerLoginId() {
		return DealerLoginId;
	}
	public void setDealerLoginId(String dealerLoginID) {
		DealerLoginId = dealerLoginID;
	}
	public int getIsActive() {
		return IsActive;
	}
	public void setIsActive(int isActive) {
		IsActive = isActive;
	}
	
	

}
