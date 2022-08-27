package com.crud.sql.service;

import java.util.List;

import com.crud.sql.dto.Piece;

public interface IPieceService {
	
	//CRUD methods
	public List<Piece> listPieces();	
	public Piece savePiece(Piece piece);	
	public Piece pieceXID(int id);
	public Piece updatePiece(Piece piece);	
	public void eliminatePiece(int id);


}
