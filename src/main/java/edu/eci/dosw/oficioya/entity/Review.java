package edu.eci.dosw.oficioya.entity;

import edu.eci.dosw.oficioya.entity.enums.RequestState;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "request")
public class Request {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "request_id")
    private Long id;

    @NotNull
    @Column(name = "creation_time", nullable = false)
    private LocalDateTime creationTime;

    @NotNull
    @Column(name = "service_time", nullable = false)
    private LocalDateTime serviceTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "state_name", nullable = false, length = 20)
    private RequestState stateName;

    @NotBlank 
    @Column(nullable = false, length = 255)
    private String description;

    @NotBlank
    @Column(nullable = false, length = 255)
    private String location;

    // Relaciones correctas hacia la tabla User
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "creator_id", nullable = false)
    private User creator;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "receiver_id", nullable = false)
    private User receiver;

    public Request() {}

    // Getters y Setters...
}
5. Entidad Review
Java
package edu.eci.dosw.oficioya.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private Long id;

    @Column(columnDefinition = "VARCHAR")
    private String comment;

    @Column(name = "rating_given")
    private Double ratingGiven;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private Contractor owner; // El diagrama indica relación de un propietario que redacta[cite: 1]

    @NotNull
    @ManyToOne
    @JoinColumn(name = "worker_id", nullable = false)
    private Worker worker; // El trabajador que la recibe[cite: 1]

}