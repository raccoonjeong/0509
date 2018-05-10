package org.zerock.security;

import java.util.Collections;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import lombok.extern.log4j.Log4j;

@Log4j
public class CustomUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		log.info("loadUserByUsername: " + username);
		
		return new User(username, "$2a$10$pwzllejbJDAdf7YgvcMaD.0C.FN4K.79.xALE2IrsuAKl4wY32WPG", Collections.singletonList(new SimpleGrantedAuthority("ROLE_ADMIN")));
	}

}