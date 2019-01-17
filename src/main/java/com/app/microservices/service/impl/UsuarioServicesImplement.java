package com.app.microservices.service.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.microservices.bean.ServiceResponse;
import com.app.microservices.model.Usuario;
import com.app.microservices.repository.UsuarioRepository;
import com.app.microservices.service.UsuarioServices;
import com.google.common.collect.Lists;

@Service
public class UsuarioServicesImplement implements UsuarioServices {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public ServiceResponse save(Usuario usuario) throws Exception {
		usuarioRepository.save(usuario);
		ServiceResponse response = new ServiceResponse("OK");
		return response;
	}

	public ServiceResponse find(BigDecimal id) throws Exception {
		Optional<Usuario> usuario = usuarioRepository.findById(id);
		ServiceResponse response = new ServiceResponse();
		response.setResponseData(usuario.get());
		return response;
	}

	public void delete(Usuario usuario) throws Exception {
		usuarioRepository.delete(usuario);
	}

	public ServiceResponse getAll() throws Exception {
		List<Usuario> myList = Lists.newArrayList(usuarioRepository.findAll());
		ServiceResponse response = new ServiceResponse();
		response.setResponseData(myList);
		return response;
	}

}
