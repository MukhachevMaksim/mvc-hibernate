package hiber;

import hiber.config.DatabaseConfig;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DatabaseConfig.class);

        UserService userService = context.getBean(UserService.class);

        User user1 = new User("Greta", "Thunberg", "alive@gmail.com");
        userService.update(11, user1);
//        userService.add(user1);

//        userService.removeUserById(14);

//        List<User> users = userService.listUsers();
//        for (User user : users) {
//            System.out.println("Id = "+user.getId());
//            System.out.println("First Name = "+user.getFirstName());
//            System.out.println("Last Name = "+user.getLastName());
//            System.out.println("Email = "+user.getEmail());
//            System.out.println();
//        }
//
//        userService.removeUserById(22);

        System.out.println(userService.getUserById(6));
        System.out.println(userService.getUserById(11));

        context.close();
    }
}
