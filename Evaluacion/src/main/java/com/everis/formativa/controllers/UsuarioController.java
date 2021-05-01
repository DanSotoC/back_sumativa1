package com.everis.formativa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.everis.formativa.models.Usuario;
import com.everis.formativa.service.UsuarioService;

@Controller
public class UsuarioController {
	@Autowired
	UsuarioService usuarioService;
	
	@RequestMapping("/usuario")
	public String usuarios(@RequestParam(value ="nombre") String nombre,
			@RequestParam(value ="apellido") String apellido,
			@RequestParam(value ="rut") String rut,
			@RequestParam(value ="cargo") String cargo,
			Model model){
		
		Usuario user = new Usuario();
		user.setNombre(nombre);
		user.setApellido(apellido);
		user.setRut(rut);
		user.setCargo(cargo);
		
		user = usuarioService.guardarUser(user);
		
		model.addAttribute("nombre", nombre);
		model.addAttribute("apellido", apellido);
		model.addAttribute("rut", rut);
		model.addAttribute("cargo", cargo);
		return "index.jsp";
		
	}
	

	
	
	
}
