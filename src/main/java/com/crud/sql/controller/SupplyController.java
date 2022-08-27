package com.crud.sql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.sql.dto.Supply;
import com.crud.sql.service.SupplyServiceImpl;

@RestController
@RequestMapping("/api")
public class SupplyController {
	
	@Autowired
	SupplyServiceImpl supplyServiceImpl;
	
	@GetMapping("/supplies")
	public List<Supply> listSupplies(){
		return supplyServiceImpl.listSupplies();		
	}
	
	@PostMapping("/supplies")
	public Supply saveSupply(@RequestBody Supply supply) {
		return supplyServiceImpl.saveSupply(supply);
	}
	
	@GetMapping("/supplies/{id}")
	public Supply supplyXID(@PathVariable(name="id") int id) {
		Supply supply_xid = new Supply();
		supply_xid = supplyServiceImpl.supplyXID(id);
		return supply_xid;
	}
	
	@PutMapping("/supplies/{id}")
	public Supply updateSupply(@PathVariable(name="id")int id,@RequestBody Supply supply) {
		Supply supply_selected = new Supply();
		Supply supply_updated = new Supply();
		
		supply_selected = supplyServiceImpl.supplyXID(id);
		supply_selected.setPiece(supply.getPiece());
		supply_selected.setProvider(supply.getProvider());
		supply_selected.setRegisteredAt(supply.getRegisteredAt());
		supply_selected.setPrice(supply.getPrice());
			
		supply_updated = supplyServiceImpl.updateSupply(supply_selected);
		return supply_updated;
	}
	
	@DeleteMapping("/supplies/{id}")
	public void eliminateSupply(@PathVariable(name="id") int id) {
		supplyServiceImpl.eliminateSupply(id);
	}
	
}
