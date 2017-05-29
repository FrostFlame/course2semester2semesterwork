package ru.kpfu.itis.group11501.serazetdinov.coursetest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.group11501.serazetdinov.coursetest.model.User;
import ru.kpfu.itis.group11501.serazetdinov.coursetest.repository.UserRepository;
import ru.kpfu.itis.group11501.serazetdinov.coursetest.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 1 on 28.05.2017.
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User findById(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    public User getUser(String login) {
        return userRepository.findOneByLogin(login);
    }

}
