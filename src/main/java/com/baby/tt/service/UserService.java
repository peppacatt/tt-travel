package com.baby.tt.service;


import com.baby.tt.common.po.User;

public interface UserService {

    public User selectUserByUsername(String username);

    public boolean login(User user);

    public boolean register(User user);

    public User logincheck(String username, String password);
}
