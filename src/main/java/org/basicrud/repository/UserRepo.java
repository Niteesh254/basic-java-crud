package org.basicrud.repository;
import org.basicrud.model.User;
import java.util.ArrayList;
import java.util.List;

public class UserRepo {
    private final List<User> users = new ArrayList<>();
    public void Save(User user){
        for (User u: users){
            if (u.getid() == user.getid()){
                throw new IllegalArgumentException("User with id " + user.getid() + " already exists.");
            }
        }
        users.add(user);
    }
    public List<User> findAll(){
        return new ArrayList<>(users);
    }
    public User findbyId(int id){
        for (User u : users){
            if (u.getid()==id){
                return u;
            }
        }
        throw new IllegalArgumentException("User with id "+ id + "not found");
    }
    public boolean update(User updateduser){
        for (int i=0; i<users.size(); i++){
            if(users.get(i).getid()==updateduser.getid()){
                users.set(i, updateduser);
                return true;
            }
        }
        return false;
    }
    public boolean deletebyid(int id){
        for(int i=0; i<users.size(); i++){
            if(users.get(i).getid()==id){
                users.remove(i);
                return true;
            }
        }
        return false;
    }
}
