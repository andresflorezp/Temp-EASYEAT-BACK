package com.easy.eat.EASYEATBACK.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easy.eat.EASYEATBACK.Documents.Mesa;
import com.easy.eat.EASYEATBACK.Repository.MesaRepository;

@Service
public class MesaService {
	@Autowired
	private MesaRepository persistentMesa;
	
	public void CreateMesa(Mesa mesa) {
		persistentMesa.insert(mesa);
	}
	
	public List<Mesa> findAllMesa() {
		return persistentMesa.findAll();
	}
}