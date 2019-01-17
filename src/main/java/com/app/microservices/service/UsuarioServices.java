package com.app.microservices.service;

import java.math.BigDecimal;

import com.app.microservices.bean.ServiceResponse;
import com.app.microservices.model.Usuario;

public interface UsuarioServices {

	ServiceResponse save(Usuario usuario) throws Exception;

	ServiceResponse find(BigDecimal id) throws Exception;

	void delete(Usuario usuario) throws Exception;

	ServiceResponse getAll() throws Exception;

}
