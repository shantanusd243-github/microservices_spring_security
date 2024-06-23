package com.example.demo.userregistrationserviceIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Util.UtilClass;
import com.example.demo.entity.RolesEntity;
import com.example.demo.entity.UserEntityClass;
import com.example.demo.userRegistrationRepo.RolesRepo;
import com.example.demo.userRegistrationRepo.UserRegistrationRepo;
import com.example.demo.userregistrationservice.UserRegistrationService;
import com.example.demo.vo.RegistrationVO;

@Service
public class UserRegistrationImpl implements UserRegistrationService {

	@Autowired
	UserRegistrationRepo userRegistrationRepo;
	
	@Autowired
	RolesRepo rolesRepo;
	
	@Autowired
	UtilClass UtilClass;
	@Override
	public Long saveUserRegistrationData(RegistrationVO vo) {

		UserEntityClass userEntity = UtilClass.RegistrationVOToEntityMapper(vo);
		UserEntityClass userROw = userRegistrationRepo.save(userEntity);
		for (String roles : vo.getRoles()) 
		{
			RolesEntity rolesEntity =new RolesEntity();
			rolesEntity.setRoles(roles);
			rolesEntity.setUserFK(userROw.getId());
			rolesRepo.save(rolesEntity);
		}
		return userROw.getId();
	}

}
