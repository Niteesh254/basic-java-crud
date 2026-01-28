package org.basicrud.service;

import org.basicrud.model.User;
import org.basicrud.repository.UserRepo;

import java.util.List;

public class UserService {
    private final UserRepo userRepos;
    public UserService(){
        this.userRepos = new UserRepo();
    }
    public void createUser(int id, String name, String emailid){
        User user = new User(id,name,emailid);
        userRepos.Save(user);
    }
    public List<User> getAllUsersfrom(){
        return userRepos.findAll();
    }
    public User getUserById(int id) {
        return userRepos.findbyId(id);
    }
    public boolean deletebyID(int id){
        return userRepos.deletebyid(id);
    }
    public boolean updateuser(int id, String name, String emailid){
        User existinguser = userRepos.findbyId(id);
        if (existinguser != null){
            existinguser.setname(name);
            existinguser.setemailid(emailid);
            return userRepos.update(existinguser);

    }
        return false;
    }
}
