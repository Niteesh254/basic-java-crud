package org.basicrud;

import org.basicrud.model.User;
import org.basicrud.repository.UserRepo;
import org.basicrud.service.UserService;

import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        userService.createUser(1,"Niteesh","niteesh@gmail.com");
        userService.createUser(2, "Bittu", "bittu123@gmail.com");
        userService.createUser(3,"Rahul","rk@gmail.com");

        List<User> users =  userService.getAllUsersfrom();
        for (User u: users){
            System.out.println(u);
        }
        User user = userService.getUserById(2);
        System.out.println(user);
        boolean updated = userService.updateuser(1,"Niteesh","nk@gmail.com");
        System.out.println(userService.getUserById(1));



        boolean updated1 = userService.updateuser(3, "Rahul K","rkpenta@gmail.com");

        for (User u: userService.getAllUsersfrom()){
            System.out.println(u);
        }

    }
}