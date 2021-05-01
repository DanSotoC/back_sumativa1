package com.everis.formativa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.everis.formativa.models.Producto;
import com.everis.formativa.service.ProductoService;

@Controller
public class ProductoController {
	@Autowired
	ProductoService productoService;
	
	@RequestMapping("/producto")
	public String productos(@RequestParam(value="name") String nombre,
			@RequestParam(value ="marca") String marca,
			@RequestParam(value ="precio") int precio,
			Model model){
		System.out.println("Dentro de productos");
		Producto prod = new Producto();
		prod.setNombre(nombre);
		prod.setMarca(marca);
		prod.setPrecio(precio);
				
		prod = productoService.guardarProducto(prod);
		
		model.addAttribute("nombre", nombre);
		model.addAttribute("marca", marca);
		model.addAttribute("precio", precio);
		return "producto.jsp";
		
	}
	

}
