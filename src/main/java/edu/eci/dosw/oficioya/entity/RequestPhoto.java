package edu.eci.dosw.oficioya.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "RequestPhoto")
public class RequestPhoto {

    @Id
    @Column(name = "request_id")
    private Long id;

    @OneToOne
    @MapsId // Comparte la misma PK que Request[cite: 1]
    @JoinColumn(name = "request_id")
    private Request request;

    @NotBlank
    @Column(columnDefinition = "json", nullable = false)
    private String content;

}