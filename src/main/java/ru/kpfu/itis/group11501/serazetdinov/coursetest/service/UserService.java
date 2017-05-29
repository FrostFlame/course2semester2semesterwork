package ru.kpfu.itis.group11501.serazetdinov.coursetest.service;

import ru.kpfu.itis.group11501.serazetdinov.coursetest.model.Status;
import ru.kpfu.itis.group11501.serazetdinov.coursetest.model.User;

import java.util.List;

/**
 * Created by 1 on 28.05.2017.
 */
public interface UserService {
    User findById(Long id);

    User getUser(String login);
}
