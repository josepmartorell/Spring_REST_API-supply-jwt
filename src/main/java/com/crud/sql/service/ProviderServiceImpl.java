package com.crud.sql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.sql.dao.IProviderDAO;
import com.crud.sql.dto.Provider;

@Service
public class ProviderServiceImpl implements IProviderService{
	
	@Autowired
	IProviderDAO iProviderDAO;

	@Override
	public List<Provider> listProviders() {
		// TODO Auto-generated method stub
		return iProviderDAO.findAll();
	}

	@Override
	public Provider saveProvider(Provider provider) {
		// TODO Auto-generated method stub
		return iProviderDAO.save(provider);
	}

	@Override
	public Provider providerXID(String code) {
		// TODO Auto-generated method stub
		return iProviderDAO.findById(code).get();
	}

	@Override
	public Provider updateProvider(Provider provider) {
		// TODO Auto-generated method stub
		return iProviderDAO.save(provider);
	}

	@Override
	public void eliminateProvider(String code) {
		// TODO Auto-generated method stub
		iProviderDAO.deleteById(code);
	}

	

}
