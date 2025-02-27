package JPA;

import JPA.Dao.UserRepository;
import JPA.Entity.User;
import JPA.Service.UserServiceIMP;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ApplicationContext context=SpringApplication.run(App.class);
        UserServiceIMP userService=context.getBean(UserServiceIMP.class);


        User usr1=new User();
        usr1.setName("kunal");
        usr1.setCity("hydrabad");

        User user1=userService.addUser(usr1);
        System.out.println(user1);

        //get all user details:
        List<User> u=userService.getUser();
        System.out.println(u);

        //getUser by id
        System.out.println(userService.findById(1));
        System.out.println(userService.count());

        //update user details
        Boolean  flag=userService.update(1,"Hariyana");
        if(flag==true){
            System.out.println("User updated ");
        }else{
            System.out.println("User not found");
        }


        Boolean status=userService.deleteById(5);
        if(status==true){
            System.out.println("Deleted successfully");
        }else{
            System.out.println("User Not Found");
        }

        List<User> user=userService.findByName("priti");
        System.out.println(user);

        List<User> userNameStartWithR=userService.findByNameStartingWith("r");
        System.out.println(userNameStartWithR);

        List<User> allUsers=userService.getAllUsers();
           for(User usr:allUsers){
               System.out.println(usr);
           }

        userService.deleteById(1);

//        User user1=new User();
//        user1.setName("priti");
//        user1.setCity("Pune");
//
//        User user2=new User();
//        user2.setName("rushi");
//        user2.setCity("satara");

       // User user=userRepository.save(user1);
       // System.out.println(user);
//        List<User> list=new ArrayList<>();
//        list.add(user1);
//        list.add(user2);
//
//
//
//        //insert data;
//         Iterable<User>resultTable=userRepository.saveAll(list);
//         resultTable.forEach(user -> {
//             System.out.println(user);
//         });



        }
    }

