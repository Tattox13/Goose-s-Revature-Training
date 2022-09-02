package com.revature.data;

import com.revature.entity.User;

import java.util.List;

public interface UserDao {
    public User insert(User user);
    public User getById(int id);

    public User getName(String name);

}
