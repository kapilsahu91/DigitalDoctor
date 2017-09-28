package com.afour.digital.service;

import java.util.List;

import com.afour.digital.model.User;

public interface IUserService {
    List<User> getAllusers();
    User getuserById(int userId);
    void adduser(User user);
    void updateuser(User user);
    void deleteuser(int userId);
}