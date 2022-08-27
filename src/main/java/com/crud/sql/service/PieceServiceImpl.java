package com.crud.sql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.sql.dao.IPieceDAO;
import com.crud.sql.dto.Piece;

@Service
public class PieceServiceImpl implements IPieceService{
	
	@Autowired
	IPieceDAO iPieceDAO;

	@Override
	public List<Piece> listPieces() {
		// TODO Auto-generated method stub
		return iPieceDAO.findAll();
	}

	@Override
	public Piece savePiece(Piece piece) {
		// TODO Auto-generated method stub
		return iPieceDAO.save(piece);
	}

	@Override
	public Piece pieceXID(int id) {
		// TODO Auto-generated method stub
		return iPieceDAO.findById(id).get();
	}

	@Override
	public Piece updatePiece(Piece piece) {
		// TODO Auto-generated method stub
		return iPieceDAO.save(piece);
	}

	@Override
	public void eliminatePiece(int id) {
		// TODO Auto-generated method stub
		iPieceDAO.deleteById(id);
	}



}
