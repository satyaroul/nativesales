package com.salestracker.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salestracker.dto.DealerDTO;

public interface Dealer_Master extends JpaRepository<DealerDTO, Integer> {

}
