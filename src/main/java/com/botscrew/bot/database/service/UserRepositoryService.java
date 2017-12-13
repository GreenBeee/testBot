package com.botscrew.bot.database.service;

import com.botscrew.bot.database.User;
import com.botscrew.bot.database.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRepositoryService {

    @Autowired
    private UserRepository userRepository;

    public boolean save(User u) {
        if (!userRepository.exists(u.getId())) {
            userRepository.save(u);
            return true;
        } else {
            return false;
        }
    }

}
