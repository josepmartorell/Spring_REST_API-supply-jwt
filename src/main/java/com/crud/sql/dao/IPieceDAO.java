package com.crud.sql.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.sql.dto.Piece;

public interface IPieceDAO extends JpaRepository<Piece, Integer>{
	
	
}
