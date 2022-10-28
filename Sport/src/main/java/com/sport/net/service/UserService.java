package com.sport.net.service;

import com.sport.net.dto.UserDto;
import com.sport.net.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> getAll();
    UserDto get(int id);
    void register(User user);

    Optional<Boolean> login (User user);

    void updateData(User user);

    UserDto getUser(User user);

}