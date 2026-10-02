package edu.eci.dosw.oficioya.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.math.BigDecimal;

public class User {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank 
    @Column(nullable = false, length = 50)
    private String name;

    @NotBlank 
    @Column(nullable = false, length = 100)
    private String correo;

    @NotBlank 
    @Column(nullable = false)
    private Long telefono;

    @NotBlank 
    @Column(nullable = true, length = 20)
    private String suscripcionId;

    public User(){

    }

    
}
