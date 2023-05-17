package com.springboot.app.security.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.app.security.modelos.Token;

@FeignClient(name="service-usuario", url="http://localhost:8080")
@RequestMapping("/token")
public interface TokenFeignClient {

	@PostMapping
    public Token addToken(@RequestBody String username,String password);
}
