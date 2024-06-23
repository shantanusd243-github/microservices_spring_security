package com.example.demo.securityConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Component;

@Component
public class SecurityConfig {

	
	@Bean
	public SecurityFilterChain setDefaultConfigCustomUI(HttpSecurity http) throws Exception {
	    http
	        .authorizeHttpRequests(authorize -> authorize
	            .requestMatchers("user/**").permitAll() // Allow access to the public page without authentication
	            .anyRequest().authenticated() // All other requests require authentication
	        )
	        .formLogin(formLogin -> formLogin
	            .loginPage("/login") // Custom login page
	            .defaultSuccessUrl("/home", true) // Redirect to /home after successful login
	            .permitAll() // Allow everyone to see the login page
	        )
	        .logout(logout -> logout
	            .permitAll() // Allow everyone to log out
	        );

	    return http.build();
	}

}