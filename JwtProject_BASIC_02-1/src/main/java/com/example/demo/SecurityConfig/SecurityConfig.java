package com.example.demo.SecurityConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Component;

@Component
public class SecurityConfig {

	
	@Bean
    public SecurityFilterChain setDefault(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(authorize -> authorize
                .requestMatchers("v1/**").permitAll()// Allow access to the public page without authentication
                .requestMatchers("v2/**").authenticated()
                .anyRequest().authenticated() // All other requests require authentication
            )
   		
         .formLogin(Customizer.withDefaults()) //Spring boot Default Login page will come 
         .httpBasic(Customizer.withDefaults());

        return http.build();
    }
}

// Note Username and Password will come in http headers


/*
 * httpBasic():
 * 
 * This method configures HTTP Basic Authentication. HTTP Basic Authentication
 * is a simple challenge-response mechanism in which the client sends the
 * username and password encoded in the HTTP request headers.
 * 
 * 
 * 
 * Customizer.withDefaults():
 * The Customizer interface in Spring Security allows for the customization of
 * various aspects of the configuration. The withDefaults() method is a static
 * method that returns a no-op customizer, meaning it applies the default
 * settings without any further customization. Putting it together:
 * 
 * When you call httpBasic(Customizer.withDefaults()), you are enabling HTTP
 * Basic Authentication with the default configuration provided by Spring
 * Security. This means that no additional customization is applied to the basic
 * authentication setup, and it will use Spring Security's default behavior.
 */