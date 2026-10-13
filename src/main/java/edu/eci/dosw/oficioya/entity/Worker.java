package edu.eci.dosw.oficioya.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "Worker")
@Inheritance(strategy = InheritanceType.JOINED)
public class Worker{

    @NotBlank
    @Column(name = "main_trade", nullable = false, length = 200)
    private String oficioPrincipal;

    @Enumerated(EnumType.STRING)
    @Column(name = "availability_state", nullable = false, length = 20)
    private Availability disponibilidad;

    @NotNull
    @Column(nullable = false)
    private Long tarifa;

    @NotNull
    @Column(name = "completed_jobs", nullable = false)
    private Integer trabajosCompletados;

    public void setOficioPrincipal(String newOficio){
        this.oficioPrincipal = newOficio;
    }

    public String getOficioPrincipal(){
        return this.oficioPrincipal;
    }

    public void setDisponibilidad(Availability dis){
        this.disponibilidad = dis;
    }

    public Availability getDisponibilidad(){
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
