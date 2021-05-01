package com.everis.formativa.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.formativa.models.Usuario;
import com.everis.formativa.repositories.UsuariosRepository;

@Service
public class UsuarioService {
		@Autowired
		UsuariosRepository userRepository;
		public Usuario guardarUser(Usuario usuario){
			return userRepository.save(usuario);
		}
		public List<Usuario> allUsers(){
			return userRepository.findAll();
		}
		
		
}
