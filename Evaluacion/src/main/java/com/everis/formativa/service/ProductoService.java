package com.everis.formativa.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.formativa.models.Producto;
import com.everis.formativa.repositories.ProductosRepository;

@Service
public class ProductoService {
	@Autowired
	ProductosRepository productoRepository;
	public Producto guardarProducto(Producto producto){
		return productoRepository.save(producto);
	}
	public List<Producto> allProduct(){
		return productoRepository.findAll();
	}
	
}
