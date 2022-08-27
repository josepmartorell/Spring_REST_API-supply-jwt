package com.crud.sql.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.sql.dto.Supply;

public interface ISupplyDAO extends JpaRepository<Supply, Integer>{

}
