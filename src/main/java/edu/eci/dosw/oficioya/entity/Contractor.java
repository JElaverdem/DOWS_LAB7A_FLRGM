package edu.eci.dosw.oficioya.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Contractor")
public class Contractor{
    // Hereda todo de User. Su PK será una FK hacia users según el diagrama.
}
