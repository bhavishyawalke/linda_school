package com.example.LindaSchool.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LindaSchool.LoginDomain.Login;
import com.example.LindaSchool.LoginRepository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	private LoginRepository repo;
	
	public Login login (String username, String password) {
		Login user = repo.findByUsernameAndPassword(username, password);
		return user;
	}
	
	
}
