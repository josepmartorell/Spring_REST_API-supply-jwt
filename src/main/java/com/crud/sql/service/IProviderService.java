package com.crud.sql.service;

import java.util.List;

import com.crud.sql.dto.Provider;

public interface IProviderService {
	
	//CRUD methods
	public List<Provider> listProviders();	
	public Provider saveProvider(Provider provider);	
	public Provider providerXID(String code);
	public Provider updateProvider(Provider provider);	
	public void eliminateProvider(String code);

}