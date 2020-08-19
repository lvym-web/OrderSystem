package com.lvym.repository;


import com.lvym.entiy.Admin;

public interface AdminRepository {
    public Admin login(String username, String password);
}
