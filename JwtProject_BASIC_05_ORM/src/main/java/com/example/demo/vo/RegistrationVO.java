package com.example.demo.vo;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegistrationVO {

	private String name;

	private String email;

	private String password;

	private Set<String> roles;
}
