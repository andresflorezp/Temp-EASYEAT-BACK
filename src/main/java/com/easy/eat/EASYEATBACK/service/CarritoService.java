package com.easy.eat.EASYEATBACK.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.easy.eat.EASYEATBACK.Documents.User;
import com.easy.eat.EASYEATBACK.Documents.Carrito;
import com.easy.eat.EASYEATBACK.Repository.CarritoRepository;

@Service
public class CarritoService {
	@Autowired
	private CarritoRepository persistentCarrito;
        
        public List<Carrito> findAllCarrito() {
		return persistentCarrito.findAll();
	}
	
	public void CreateCarrito(Carrito carrito) {
		persistentCarrito.insert(carrito);
	}
	
	
        
}
