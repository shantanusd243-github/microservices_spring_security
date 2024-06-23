package com.example.demo.Util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.example.demo.entity.UserEntityClass;
import com.example.demo.vo.RegistrationVO;

@Component
public class UtilClass {

	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	public UserEntityClass RegistrationVOToEntityMapper(RegistrationVO vo) {

		return UserEntityClass.builder()
				.name(vo.getName())
				.email(vo.getEmail())
				.password(encodethePassword(vo.getPassword()))
				.build();

	}

	public String encodethePassword(String pwd) {
		return bCryptPasswordEncoder.encode(pwd);
	}

}
