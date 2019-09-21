package com.salestracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salestracker.dto.DealerDTO;
import com.salestracker.dto.RetailerResponseModelDTO;
import com.salestracker.service.TestResponse;

@RestController
public class TestResponseController {
	@Autowired
	private TestResponse ts;
	@GetMapping("response")
	public List<RetailerResponseModelDTO> testRes(){
				
		return ts.response();
	}
	
	@GetMapping("dealer")
	public List<DealerDTO> testRes2(){
		
		return ts.newRes();
	}

}
