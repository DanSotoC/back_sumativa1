package com.everis.formativa.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.everis.formativa.models.Usuario;
import com.everis.formativa.repositories.UsuariosRepository;
import com.everis.formativa.service.UsuarioService;

@Controller
public class TablaUserController {
	@Autowired
	UsuarioService usuarioService;
	
	@Autowired
	UsuariosRepository usuarioRepository;
	
	@RequestMapping("/tabla_usuarios")
	public String listaUsuarios(Model modelo){
		
			ArrayList<Usuario> userList = new ArrayList<Usuario>();
			userList = (ArrayList<Usuario>)usuarioService.allUsers();
			int largo = userList.size();
			modelo.addAttribute("userList",userList);
			modelo.addAttribute("largo", largo);
			
			return "userlist.jsp";
	}	
	@RequestMapping("/delete/usuario")
	public String borrarUsuarios(@RequestParam(value="id") String id, Model modelo){
			ArrayList<Usuario> userList = new ArrayList<Usuario>();
			userList = (ArrayList<Usuario>)usuarioService.allUsers();
			int index = Integer.parseInt(id);
			System.out.println(index);
			userList.remove(index);
			return "userlist.jsp";
	}
}
