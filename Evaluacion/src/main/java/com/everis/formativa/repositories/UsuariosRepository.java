package com.everis.formativa.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.everis.formativa.models.Usuario;


@Repository
public interface UsuariosRepository extends CrudRepository<Usuario, Long> {
		List<Usuario> findAll();
		
}
