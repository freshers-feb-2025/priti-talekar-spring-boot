package JPA.Service;
import JPA.Entity.User;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserService {


     User addUser(User user);

     List<User>getUser();
     User findById(int id);
     long count();

     boolean deleteById(int id);

     boolean update(int id,String city);

     List<User> findByName(String name);

     List<User> findByNameStartingWith(String prefix);

     List<User> getAllUsers();

     void deleterow(int id);
}
