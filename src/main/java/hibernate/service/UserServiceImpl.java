package hibernate.service;


import hibernate.dao.serv.UserDao;
import hibernate.model.User;
import hibernate.service.serv.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDao.findAllUsers();
    }

    @Override
    @Transactional
    public User getUserById(int id) {
        return userDao.findUserById(id);
    }
}
