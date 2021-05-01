package com.everis.formativa.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="productos")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(min=4,max= 50)
	private String nombre;
	@Size(min=4,max= 50)
	private String marca;
	@Size(min=3,max=9)
	private int precio;
	
	public Producto() {}
	
	public Producto(@Size(min = 4, max = 50) String nombre, @Size(min = 4, max = 50) String marca,
			@Size(min = 3, max = 9) int precio) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
	}
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
}
