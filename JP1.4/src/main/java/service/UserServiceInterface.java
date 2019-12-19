package service;

import model.User;

import java.util.List;

public interface UserServiceInterface {
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(long id);
    List<User> getAllUsers();

}
