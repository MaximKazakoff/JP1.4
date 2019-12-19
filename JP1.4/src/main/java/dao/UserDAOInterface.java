package dao;

import model.User;

import java.util.List;

public interface UserDAOInterface {
    void addUser(User user);
    void editUser(User user);
    void deleteUser(long id);
    boolean isExistUser(User user);
    List<User> getAllUsers();
}
