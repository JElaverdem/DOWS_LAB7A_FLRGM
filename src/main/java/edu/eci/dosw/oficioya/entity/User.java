package edu.eci.dosw.oficioya.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @NotBlank
    @Column(nullable = false)
    private String name;

    @Column(columnDefinition = "json")
    private String photo;

    @Email
    @NotBlank
    @Column(nullable = false, length = 150)
    private String email;

    @NotBlank
    @Column(nullable = false, length = 15)
    private String phone;

    @Column(name = "rating")
    private Double rating;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "subscription_id")
    private UserSubscription subscription;

}
