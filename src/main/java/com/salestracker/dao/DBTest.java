package com.salestracker.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.salestracker.dto.DealerDTO;
import com.salestracker.entity.Dealer_Master;

@Component
public class DBTest {
	
	@Autowired
	Dealer_Master Dealer;
	
	public void saveData(List<DealerDTO> data) {
		
		
		Dealer.saveAll(data);
	}
	
	public List<DealerDTO> getData() {
		return Dealer.findAll();
	}

}
