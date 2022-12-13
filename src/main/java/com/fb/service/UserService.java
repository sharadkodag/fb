package com.fb.service;

import com.fb.entity.User;

import java.util.List;

public interface UserService {

    public List<User> getUserList();
    public void addUser(User user);

}
