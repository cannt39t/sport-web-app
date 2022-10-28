package com.sport.net.dao;

import com.sport.net.model.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {

    User get(int id);

    List<User> getAll();

    void save(User user);

    Optional<Boolean> login(User user);

}
