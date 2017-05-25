package ru.kpfu.itis.group11501.serazetdinov.coursetest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.group11501.serazetdinov.coursetest.model.Group;
import ru.kpfu.itis.group11501.serazetdinov.coursetest.repository.GroupRepository;
import ru.kpfu.itis.group11501.serazetdinov.coursetest.service.GroupService;

/**
 * Created by 1 on 25.05.2017.
 */
@Service
public class GroupServiceImpl implements GroupService {
    GroupRepository groupRepository;

    @Autowired
    public GroupServiceImpl(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public Group findByName(String name) {
        return groupRepository.findByName(name);
    }
}
