package com.crud.sql.service;

import java.util.List;

import com.crud.sql.dto.Supply;

public interface ISupplyService {
	
	//CRUD methods
	public List<Supply> listSupplies();	
	public Supply saveSupply(Supply supply);	
	public Supply supplyXID(int id);
	public Supply updateSupply(Supply supply);	
	public void eliminateSupply(int id);

}
