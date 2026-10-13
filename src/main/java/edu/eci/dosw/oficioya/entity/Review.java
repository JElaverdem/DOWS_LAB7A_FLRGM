package edu.eci.dosw.oficioya.entity;

import edu.eci.dosw.oficioya.entity.Worker;
import edu.eci.dosw.oficioya.entity.Contractor;
import edu.eci.dosw.oficioya.entity.RequestState;
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
    private Worker worker; 
    public Review() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }

    public Double getRatingGiven() { return ratingGiven; }
    public void setRatingGiven(Double ratingGiven) { this.ratingGiven = ratingGiven; }

    public Contractor getOwner() { return owner; }
    public void setOwner(Contractor owner) { this.owner = owner; }

    public Worker getWorker() { return worker; }
    public void setWorker(Worker worker) { this.worker = worker; }

    
}