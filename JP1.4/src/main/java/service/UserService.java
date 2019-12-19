package service;

import connected.ConnectedDB;
import dao.UserDAO;
import model.User;

import java.sql.Connection;
import java.util.List;

public class UserService implements UserServiceInterface {

    @Override
    public void addUser(User user){
        System.out.println("<---- Used method: addUser() ---->");
        UserDAO dao = ConnectedDB.getUserDAO();
        if (!dao.isExistUser(user)) {
            dao.addUser(user);
        }
    }

    @Override
    public void updateUser(User user) {
        System.out.println("<---- Used method: editUser() ---->");
        ConnectedDB.getUserDAO().editUser(user);
    }

    @Override
    public void deleteUser(long id) {
        System.out.println("<---- Used method: deleteUser() ---->");
        ConnectedDB.getUserDAO().deleteUser(id);
    }

    @Override
    public List<User> getAllUsers() {
        System.out.println("<---- Used method: getAllUsers() ---->");
        return ConnectedDB.getUserDAO().getAllUsers();
    }

    public List<List<String>> getAllUsersList() {
        System.out.println("<---- Used method: getAllUsers() ---->");
        return ConnectedDB.getUserDAO().getAllUsersList();
    }



}
