package ru.kpfu.itis.group11501.serazetdinov.coursetest.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by 1 on 23.03.2017.
 */
@Entity
@Table(name = "groups")
public class Group {
    @Column
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }
    @Column
    @OneToMany(mappedBy = "group")
    private List<Student> students;
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "models.Group{name: " + name + "}";
    }
}
