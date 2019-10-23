package com.easy.eat.EASYEATBACK.Documents;

import java.io.Serializable;
import java.util.ArrayList;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Mesa")
public class Mesa implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
        
	@Id
	private String id;
	
	private ArrayList<User> comensales;
	
	private ArrayList<Plato> platos;
	
	public Mesa () {
		// TODO Auto-generated constructor stub
	}

    public Mesa(String id, ArrayList<User> comensales, ArrayList<Plato> platos) {
        this.id = id;
        this.comensales = comensales;
        this.platos = platos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<User> getComensales() {
        return comensales;
    }

    public void setComensales(ArrayList<User> comensales) {
        this.comensales = comensales;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }
        
}
