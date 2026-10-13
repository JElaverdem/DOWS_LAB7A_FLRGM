package edu.eci.dosw.oficioya.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import edu.eci.dosw.oficioya.model.AvailabilityModel;

@Entity
@Table(name = "Worker")
@Inheritance(strategy = InheritanceType.JOINED)
public class Worker{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "main_trade", nullable = false, length = 200)
    private String oficioPrincipal;

    @Enumerated(EnumType.STRING)
    @Column(name = "availability_state", nullable = false, length = 20)
    private AvailabilityModel disponibilidad;

    @NotNull
    @Column(nullable = false)
    private Long tarifa;

    @NotNull
    @Column(name = "completed_jobs", nullable = false)
    private Integer trabajosCompletados;

    public void setId(Long newD){
        this.id = newD;
    }

    public Long getId(){
        return this.id;
    }
    public void setOficioPrincipal(String newOficio){
        this.oficioPrincipal = newOficio;
    }

    public String getOficioPrincipal(){
        return this.oficioPrincipal;
    }

    public void setDisponibilidad(AvailabilityModel dis){
        this.disponibilidad = dis;
    }

    public AvailabilityModel getDisponibilidad(){
        return this.disponibilidad;
    }

    public void setTarifa(Long tf){
        this.tarifa = tf;
    }

    public Long getTarifa(){
        return this.tarifa;
    }

    public void setTrabajosCompletados(Integer tc){
        this.trabajosCompletados = tc;
    }

    public Integer getTrabajosCompletados(){
        return this.trabajosCompletados;
    }
}
