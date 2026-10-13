package edu.eci.dosw.oficioya.entity;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "pet_caretaker")
public class PetCaretaker extends Worker {

    @ElementCollection
    @CollectionTable(name = "pet_caretaker_animal", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "animal_name", length = 50)
    private Set<String> animals;

}