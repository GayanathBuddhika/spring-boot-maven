package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.UserModel;


public interface UserRepo extends JpaRepository<UserModel,Integer> {

}
