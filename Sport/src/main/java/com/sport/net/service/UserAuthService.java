package com.sport.net.service;

import com.sport.net.dto.UserAuthDto;

import java.util.List;

public interface UserAuthService {

    List<UserAuthDto> getAll();
    UserAuthDto get(int id);
}