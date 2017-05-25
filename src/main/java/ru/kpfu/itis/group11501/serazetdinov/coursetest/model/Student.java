package ru.kpfu.itis.group11501.serazetdinov.coursetest.model;

import javax.persistence.*;

/**
 * Created by 1 on 23.03.2017.
 */
@Entity
@Table(name = "students")
public class Student {
    @Column
    private String name;

    @ManyToOne
    private Group group;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
