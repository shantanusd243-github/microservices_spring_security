package com.example.demo.InMemoryConfig;


import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Component;

@Component
public class InMemoryConfigFile {
	//https://docs.spring.io/spring-security/reference/servlet/authentication/passwords/in-memory.html
	@Bean
	public UserDetailsService users() {
		// The builder will ensure the passwords are encoded before saving in memory
		UserBuilder users = User.withDefaultPasswordEncoder();
		
		UserDetails user = users
			.username("user")
			.password("password")
			.roles("USER")
			.build();
		
		
		UserDetails admin = users
			.username("admin")
			.password("password")
			.roles("USER", "ADMIN")
			.build();
		
		
		return new InMemoryUserDetailsManager(user, admin);
	}
	
	
}
