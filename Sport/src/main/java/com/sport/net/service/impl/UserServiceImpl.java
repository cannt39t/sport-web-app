package com.sport.net.service.impl;

import com.sport.net.dao.impl.UserDaoImpl;
import com.sport.net.dto.UserDto;
import com.sport.net.model.User;
import com.sport.net.service.UserService;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {

    UserDaoImpl userDao = new UserDaoImpl();


    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public UserDto get(int id) {
        return null;
    }

    @Override
    public void register(User user) {
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.save(user);
    }
    @Override
    public Optional<Boolean> login(User user) {
        Optional<Boolean> res  = userDao.login(user);
        return res;
    }

    @Override
    public void updateData(User user) {
        userDao.update(user);
    }

    @Override
    public UserDto getUser(User user) {
        for(User users : userDao.getAll()){
            if (users.getLogin().equals(user.getLogin()) || users.getEmail().equals(user.getEmail())){
                return new UserDto(users.getLogin(), users.getEmail(), users.getGender(), users.getGoal(), users.getForm(), users.getName(), users.getAge(), users.getHeight(), users.getWeight());
            }
        }
        return null;
    }

}
