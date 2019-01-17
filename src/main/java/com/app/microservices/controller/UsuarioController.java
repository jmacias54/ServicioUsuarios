package com.app.microservices.controller;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.microservices.bean.ServiceResponse;
import com.app.microservices.model.Usuario;
import com.app.microservices.service.UsuarioServices;
import com.app.microservices.util.HttpUtils;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
	private static final Logger logger = LoggerFactory.getLogger(UsuarioController.class);

	@Autowired
	private UsuarioServices usuarioService;

	@PostMapping("/save")
	public ResponseEntity<ServiceResponse> save(@RequestBody Usuario usuario) throws JsonProcessingException {
		ServiceResponse serviceResponse = new ServiceResponse();
		try {
			serviceResponse = usuarioService.save(usuario);
			return new ResponseEntity<>(serviceResponse, HttpStatus.OK);
		} catch (Exception e) {
			HttpUtils.preparedErrorResponse(serviceResponse, e.getMessage(),
					String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR));
			logger.info(".:: End Save usuario Error Response : {}", HttpUtils.printInformation(serviceResponse), e);
			return new ResponseEntity<>(serviceResponse, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping("/delete")
	public ResponseEntity<ServiceResponse> delete(@RequestBody Usuario usuario) throws JsonProcessingException {
		ServiceResponse serviceResponse = new ServiceResponse();
		try {
			usuarioService.delete(usuario);
			return new ResponseEntity<>(serviceResponse, HttpStatus.OK);
		} catch (Exception e) {
			HttpUtils.preparedErrorResponse(serviceResponse, e.getMessage(),
					String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR));
			logger.info(".:: End Save usuario Error Response : {}", HttpUtils.printInformation(serviceResponse), e);
			return new ResponseEntity<>(serviceResponse, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/find")
	public ResponseEntity<ServiceResponse> getById(@RequestParam BigDecimal id) throws JsonProcessingException {
		ServiceResponse serviceResponse = new ServiceResponse();
		try {
			serviceResponse = usuarioService.find(id);
			return new ResponseEntity<>(serviceResponse, HttpStatus.OK);
		} catch (Exception e) {
			HttpUtils.preparedErrorResponse(serviceResponse, e.getMessage(), String.valueOf(HttpStatus.NOT_FOUND));
			logger.info(".:: End Get usuario Error Response : {}", HttpUtils.printInformation(serviceResponse), e);
			return new ResponseEntity<>(serviceResponse, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/all")
	public ResponseEntity<ServiceResponse> getAll() throws JsonProcessingException {
		ServiceResponse serviceResponse = new ServiceResponse();
		try {
			serviceResponse = usuarioService.getAll();
			return new ResponseEntity<>(serviceResponse, HttpStatus.OK);
		} catch (Exception e) {
			HttpUtils.preparedErrorResponse(serviceResponse, e.getMessage(), String.valueOf(HttpStatus.NOT_FOUND));
			logger.info(".:: End Get usuario Error Response : {}", HttpUtils.printInformation(serviceResponse), e);
			return new ResponseEntity<>(serviceResponse, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
