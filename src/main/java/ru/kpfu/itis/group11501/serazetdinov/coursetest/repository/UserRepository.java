package ru.kpfu.itis.group11501.serazetdinov.coursetest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.group11501.serazetdinov.coursetest.model.User;

//import org.springframework.data.repository.CrudRepository;

/**
 * Created by 1 on 28.05.2017.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findOneByLogin(String login);
}
