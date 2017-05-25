package ru.kpfu.itis.group11501.serazetdinov.coursetest.service;

import org.springframework.stereotype.Service;
import ru.kpfu.itis.group11501.serazetdinov.coursetest.model.Group;

/**
 * Created by 1 on 25.05.2017.
 */
@Service
public interface GroupService {
    Group findByName(String name);
}
