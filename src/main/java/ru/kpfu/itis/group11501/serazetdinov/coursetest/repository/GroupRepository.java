package ru.kpfu.itis.group11501.serazetdinov.coursetest.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import ru.kpfu.itis.group11501.serazetdinov.coursetest.model.Group;

/**
 * Created by 1 on 25.05.2017.
 */
public interface GroupRepository extends CrudRepository<Group, Integer> {
    @Query("select distinct s from Group s where s.name = :name")
    Group findByName(@Param("name") String name);
}
