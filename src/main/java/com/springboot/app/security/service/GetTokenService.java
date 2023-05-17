package com.springboot.app.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.security.feignclients.TokenFeignClient;
import com.springboot.app.security.modelos.Token;

@Service
public class GetTokenService {

	@Autowired
	private TokenFeignClient feignToken;

	public Token saveUsuario() {

		Token token = feignToken.addToken("", "");

		return token;
	}

}
