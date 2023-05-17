package com.springboot.app.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.security.modelos.Token;
import com.springboot.app.security.service.GetTokenService;

@RestController
public class TokenController {

	@Autowired
	private GetTokenService getTokenService;

	@GetMapping("get-token")
	public ResponseEntity<Token> getToken() {

		Token token = getTokenService.saveUsuario();
		return ResponseEntity.ok(token);

	}

}