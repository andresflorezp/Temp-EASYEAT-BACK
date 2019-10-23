package com.easy.eat.EASYEATBACK.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easy.eat.EASYEATBACK.Documents.Plato;
import com.easy.eat.EASYEATBACK.Repository.PlatoRepository;

@Service
public class PlatoService {
	@Autowired
	private PlatoRepository persistentPlato;
	
	public void CreatePlato(Plato plato) {
		persistentPlato.save(plato);
	}
	
	public List<Plato> findAllPlato() {
		return persistentPlato.findAll();
	}
}