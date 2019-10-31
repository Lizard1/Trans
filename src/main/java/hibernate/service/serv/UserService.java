package hibernate.service.serv;

import hibernate.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(int id);
}
