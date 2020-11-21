package com.blog.service;

import com.blog.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public boolean login(User user) {
        if(user.getUsername().equals("validuser")) {
            return true;
        }
        else {
            return false;
        }
    }

}
