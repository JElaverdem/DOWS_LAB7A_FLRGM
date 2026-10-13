package edu.eci.dosw.oficioya.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "Worker")
@Inheritance(strategy = InheritanceType.JOINED)
public class Worker extends User {

    @NotBlank
    @Column(name = "main_trade", nullable = false, length = 200)
    private String mainTrade;

    @Enumerated(EnumType.STRING)
    @Column(name = "availability_state", nullable = false, length = 20)
    private Availability availabilityState;

    @NotNull
    @Column(nullable = false)
    private Long rate;

    @NotNull
    @Column(name = "completed_jobs", nullable = false)
    private Integer completedJobs;

}
