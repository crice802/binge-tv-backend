package org.cory.rice.bingetv.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
	
	@GetMapping("/auth")
	public String auth() {
		return "Auth";
	}
}
