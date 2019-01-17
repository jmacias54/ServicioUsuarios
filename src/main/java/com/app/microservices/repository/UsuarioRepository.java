package com.app.microservices.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.microservices.model.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, BigDecimal> {

	@Query("SELECT u FROM Usuario u where name = ?1")
	public List<Usuario> findByName(String name);

}
