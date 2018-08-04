package com.example.demo.servicesImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.UserModel;
import com.example.demo.repositories.UserRepository;
import com.example.demo.services.UserServices;


@Service
public class UserImpl implements UserServices{
	@Autowired
	private UserRepository userrepo;
	public List<UserModel> findAllUsers() {
		List<UserModel> alluser = userrepo.findAll();
		return alluser;
		
	}
	@Override
	public String saveUser(UserModel allUser) {
		userrepo.save(allUser);
		return "saved all user";
	}
	@Override
	public String updateUser(UserModel newUser) {
	    String msg=null;
		if(newUser.getId() != 0){
			userrepo.save(newUser);
			msg="update user";
		}else {
			msg="error";
		}
		return msg;
	}
	@Override
	public UserModel findById(Integer id) {
		
		return userrepo.getOne(id);
	}

	

}
