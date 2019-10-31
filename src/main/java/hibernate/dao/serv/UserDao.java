package hibernate.dao.serv;

import hibernate.model.User;

import java.util.List;

public interface UserDao {
    User findUserById(int id);
    List<User> findAllUsers();
}
