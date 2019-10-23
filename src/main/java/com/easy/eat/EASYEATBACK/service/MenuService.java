package com.easy.eat.EASYEATBACK.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.easy.eat.EASYEATBACK.Documents.User;
import com.easy.eat.EASYEATBACK.Documents.Carrito;
import com.easy.eat.EASYEATBACK.Documents.Menu;
import com.easy.eat.EASYEATBACK.Repository.CarritoRepository;
import com.easy.eat.EASYEATBACK.Repository.MenuRepository;

@Service
public class MenuService {
	@Autowired
	private MenuRepository persistentMenu;
        
        public List<Menu> findAllMenu() {
		return persistentMenu.findAll();
	}
	
	public void CreateMenu(Menu Menu) {
		persistentMenu.insert(Menu);
	}
	
	
        
}
