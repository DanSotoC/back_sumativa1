package com.everis.formativa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.everis.formativa.models.Producto;
import com.everis.formativa.repositories.ProductosRepository;
import com.everis.formativa.service.ProductoService;

import java.util.ArrayList;

@Controller
public class TablaProductosController {
	@Autowired
	ProductoService productoService;
	
	@Autowired
	ProductosRepository productoRepository;
	
	@RequestMapping("/tabla_productos")
	public String listaProductos(Model modelo){
		
			ArrayList<Producto> prodList = new ArrayList<Producto>();
			prodList = (ArrayList<Producto>)productoService.allProduct();
			int largo = prodList.size();
			modelo.addAttribute("productList",prodList);
			modelo.addAttribute("largo", largo);
			
			return "productlist.jsp";
	}	
	
	@RequestMapping("/delete/producto")
	public String borrarProductos(@RequestParam(value="id") String id, Model modelo){
			ArrayList<Producto> prodList = new ArrayList<Producto>();
			prodList = (ArrayList<Producto>)productoService.allProduct();
			int index = Integer.parseInt(id);
			System.out.println(index);
			prodList.remove(index);
			
			return "productlist.jsp";
	}
}
