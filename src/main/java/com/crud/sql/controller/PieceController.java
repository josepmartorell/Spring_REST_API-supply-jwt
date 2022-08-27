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

import com.crud.sql.dto.Piece;
import com.crud.sql.service.PieceServiceImpl;

@RestController
@RequestMapping("/api")
public class PieceController {
	
	@Autowired
	PieceServiceImpl pieceServiceImpl;
	
	@GetMapping("/pieces")
	public List<Piece> listProviders(){
		return pieceServiceImpl.listPieces();		
	}
	
	@PostMapping("/pieces")
	public Piece savePiece(@RequestBody Piece piece) {
		return pieceServiceImpl.savePiece(piece);
	}
	
	@GetMapping("/pieces/{id}")
	public Piece pieceXID(@PathVariable(name="id") int id) {
		Piece piece_xid = new Piece();
		piece_xid = pieceServiceImpl.pieceXID(id);
		return piece_xid;
	}
	
	@PutMapping("/pieces/{id}")
	public Piece updatePiece(@PathVariable(name="id")int id,@RequestBody Piece piece) {
		Piece piece_selected = new Piece();
		Piece piece_updated = new Piece();
		
		piece_selected = pieceServiceImpl.pieceXID(id);		
		piece_selected.setName(piece.getName());
		
		piece_updated = pieceServiceImpl.updatePiece(piece_selected);
		return piece_updated;
	}
	
	@DeleteMapping("/pieces/{id}")
	public void eliminatePiece(@PathVariable(name="id") int id) {
		pieceServiceImpl.eliminatePiece(id);
	}
	
}
