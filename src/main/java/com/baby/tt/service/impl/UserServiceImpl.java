package com.baby.tt.service.impl;


import com.baby.tt.common.po.User;
import com.baby.tt.dao.UserDao;
import com.baby.tt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userdao;

    @Override
    public boolean login(User user) {
        String name = user.getUsername();
        String password = user.getPassword();
        User u1 = userdao.selectUserByName(name);
        if (u1 == null) {
            return false;
        } else {
            if (u1.getPassword().equals(password)) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public boolean register(User user) {
        int x = userdao.insertUser(user);
        if (x > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public User selectUserByUsername(String username) {
        // TODO Auto-generated method stub
        return userdao.selectUserByName(username);
    }

    @Override
    public User logincheck(String username, String password) {
        // TODO Auto-generated method stub
        return userdao.login(username, password);
    }


}
