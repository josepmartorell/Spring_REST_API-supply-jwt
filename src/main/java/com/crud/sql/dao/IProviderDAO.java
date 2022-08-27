package com.crud.sql.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.sql.dto.Provider;

public interface IProviderDAO extends JpaRepository<Provider, String>{

}
