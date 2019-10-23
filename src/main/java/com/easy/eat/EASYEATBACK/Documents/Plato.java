package com.easy.eat.EASYEATBACK.Documents;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Plato")
public class Plato implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
        
	@Id
	private String id;
	
	private String nombre;
        
    private String categoria;
	
	private String descripcion;
	
	private Double precio;
	
	public Plato() {
		// TODO Auto-generated constructor stub
	}

    public Plato(String id, String nombre, String categoria, String descripcion, Double precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
        
}