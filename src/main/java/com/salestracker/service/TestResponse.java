package com.salestracker.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

import com.salestracker.dao.DBTest;
import com.salestracker.dto.DealerDTO;
import com.salestracker.dto.RetailerResponseModelDTO;
import com.salestracker.dto.TransactionDTO;
import com.salestracker.dto.TransactionDetailsDTO;

@Service
public class TestResponse {
	
	@Autowired
	DBTest dBTest;

	public List<RetailerResponseModelDTO> response() {

		List<RetailerResponseModelDTO> res = new ArrayList<RetailerResponseModelDTO>();

		TransactionDetailsDTO td1 = new TransactionDetailsDTO(1, "CTOP", 10, 500);
		TransactionDetailsDTO td2 = new TransactionDetailsDTO(2, "ARFone", 10, 1000);
		TransactionDetailsDTO td3 = new TransactionDetailsDTO(3, "SIM", 5, 100);
		List<TransactionDetailsDTO> TDF = new ArrayList<TransactionDetailsDTO>();
		TDF.add(td1);
		TDF.add(td2);
		TDF.add(td3);

		TransactionDTO t1 = new TransactionDTO();
		t1.setTransactionID(1);
		t1.setDate(new Date());
		t1.setAmmount(1600);
		t1.setIsActive(1);
		t1.setTransactionDetails(TDF);
		List<TransactionDTO> TD = new ArrayList<TransactionDTO>();
		TD.add(t1);

		RetailerResponseModelDTO res1 = new RetailerResponseModelDTO(1, 1, "Retailer1", TD);

		res.add(res1);

		return res;

	}
	
	public List<DealerDTO> newRes(){
		return dBTest.getData();
	}
	
	public List<DealerDTO> dealer(){
		
		DealerDTO data = new DealerDTO();
		
		data.setDealerArea("Salipur");
		data.setDealerName("Satya");
		data.setDealerNumber(876328424);
		data.setDealerLoginId("Satya.roul");
		data.setDealerPassword("password");
		data.setIsActive(1);
		
		List<DealerDTO> newdata = new ArrayList<DealerDTO>();
		
		newdata.add(data);
		
		dBTest.saveData(newdata);
		return newdata;
	}

}
