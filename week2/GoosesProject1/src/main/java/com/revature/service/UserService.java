package com.revature.service;

import com.revature.data.DaoFactory;
import com.revature.data.UserDao;
import com.revature.entity.User;

public class UserService {
    public User register(User user) {

        UserDao userDao = DaoFactory.getUserDao();
        User user1 = userDao.insert(user);

        return user1;
    }

    public User login(String name, String password) {

        UserDao userDao = DaoFactory.getUserDao();
        User user = userDao.getName(name);
        if (password.equals(user.getPassword())) {

            return user;
        }

        return null;
    }
}
