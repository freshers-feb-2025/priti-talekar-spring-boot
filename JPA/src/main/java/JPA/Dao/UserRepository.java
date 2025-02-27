package JPA.Dao;

import JPA.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserRepository extends JpaRepository<User,Integer> {


    //custome queries
    public List<User> findByName(String name);

    List<User> findByNameStartingWith(String prefix);

    @Query(value = "select * from Users",nativeQuery = true)
    List<User> getAllUsers();

    @Query(value = "delete from Users where id = ?1", nativeQuery = true)
    void deleterow(int id);


}
