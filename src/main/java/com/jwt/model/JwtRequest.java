package com.jwt.model;

import lombok.Data;

@Data
public class JwtRequest {
	String username;
	String password;
	
}