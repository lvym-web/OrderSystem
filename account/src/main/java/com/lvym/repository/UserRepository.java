package com.lvym.repository;


import com.lvym.entiy.User;

public interface UserRepository {
    public User login(String username, String password);
}
