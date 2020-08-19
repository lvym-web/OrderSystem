package com.lvym.repository;


import com.lvym.entiy.User;

import java.util.List;

public interface UserRepository {
    public List<User> findAll(int index, int limit);
    public int count();
    public void save(User user);
    public void deleteById(long id);

}
