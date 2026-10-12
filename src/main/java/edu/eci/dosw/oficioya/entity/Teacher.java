package edu.eci.dosw.oficioya.entity;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Teacher")
public class Teacher extends Worker {

    @Column(length = 50)
    private String level;

    @ElementCollection
    @CollectionTable(name = "teacher_subject", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "subject_name", length = 50)
    private Set<String> subjects;

}