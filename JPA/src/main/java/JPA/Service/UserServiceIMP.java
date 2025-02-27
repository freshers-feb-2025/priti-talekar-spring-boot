package JPA.Service;

import JPA.Dao.UserRepository;
import JPA.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceIMP implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getUser() {
        return userRepository.findAll();
    }

    @Override
    public User findById(int id) {
        Optional<User> optional=userRepository.findById(id);
        if(optional.isPresent()){
            return optional.get();
        }
        return null;
    }

    public long count(){
        return userRepository.count();
    }

    @Override
    public boolean deleteById(int id) {
        boolean status=false;
        try{
            userRepository.deleteById(id);
            status=true;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean update(int id, String city) {
        User user=findById(id);
        if(user!=null){
            user.setCity(city);
            userRepository.save(user);
            return true;
        }

     return false;
    }

    @Override
    public List<User> findByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public List<User> findByNameStartingWith(String prefix) {
        return userRepository.findByNameStartingWith(prefix);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public void deleterow(int id) {
             userRepository.deleterow(id);
    }


}
