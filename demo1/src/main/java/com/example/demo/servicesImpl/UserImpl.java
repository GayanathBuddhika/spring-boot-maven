package com.example.demo.servicesImpl;
import repositories.UserRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.UserModel;
import com.example.demo.services.UserServices;


@Service
public class UserImpl implements UserServices{
	@Autowired
	private UserRepo userrepo;
	public List<UserModel> findAllUsers() {
		List<UserModel> alluser=userrepo.findAll();
		return alluser;
		
	}

	

}
