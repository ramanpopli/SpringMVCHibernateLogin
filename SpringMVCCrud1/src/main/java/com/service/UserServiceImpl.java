package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserServiceDao;
import com.entity.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired 
	private UserServiceDao userdao;
	
	public boolean  RegisterUser(User users) {
		
		return userdao.saveorupdate(users);
	}

	/*public List<User> LoginUser(User users) {
		

		return userdao.LoginUser(users);

	}*/
public List<User> LoginUser(User users) {
		

		 return userdao.LoginUser(users);
}

}
