package org.zerock.controller;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import lombok.extern.log4j.Log4j;

@Log4j
public class EncryptTests {
	
	@Test
	public void testMatches() {
		
		String enStr = "$2a$10$pwzllejbJDAdf7YgvcMaD.0C.FN4K.79.xALE2IrsuAKl4wY32WPG";
		String user = "1111";
		
		BCryptPasswordEncoder pwencoder = new BCryptPasswordEncoder();
		
		boolean matching = pwencoder.matches(user, enStr);
		
		System.out.println(matching);//true
				
	}

	@Test
	public void testEncrypt() {
		
		BCryptPasswordEncoder pwencoder = new BCryptPasswordEncoder();
		
		String str = "1111";
		
		String enStr = pwencoder.encode(str);//매번 다르게 생성
		
		System.out.println(enStr);
		
	}
}
