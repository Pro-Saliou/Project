package com.example.config;

import com.example.entities.User;
import com.example.entities.UserDto;

public interface IUserService {
    User registerNewUserAccount(UserDto userDto)     
      throws UserAlreadyExistException;
}