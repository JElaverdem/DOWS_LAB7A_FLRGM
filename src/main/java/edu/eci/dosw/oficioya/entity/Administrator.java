package edu.eci.dosw.oficioya.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Administrator")
public class Administrator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public Long getId(){
        return this.id;
    }

    public void setId(Long d){
        this.id = d;
    }
}