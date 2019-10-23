package com.easy.eat.EASYEATBACK.Documents;

import java.io.Serializable;
import java.util.ArrayList;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Carrito")
public class Carrito implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
        
	@Id
	private String id;
	
	private ArrayList<Plato> platos;
	
	private User dueño;
	
	public Carrito() {
		// TODO Auto-generated constructor stub
	}

    public Carrito(String id, ArrayList<Plato> platos, User dueño) {
        this.id = id;
        this.platos = platos;
        this.dueño = dueño;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }

    public User getDueño() {
        return dueño;
    }

    public void setDueño(User dueño) {
        this.dueño = dueño;
    }
        
        
        
}
        
	