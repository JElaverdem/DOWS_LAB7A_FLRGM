package edu.eci.dosw.oficioya.entity;

import edu.eci.dosw.oficioya.entity.Worker;
import edu.eci.dosw.oficioya.entity.Contractor;
import edu.eci.dosw.oficioya.entity.enums.RequestState;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

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