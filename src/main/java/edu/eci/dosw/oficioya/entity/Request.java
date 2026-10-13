package edu.eci.dosw.oficioya.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.math.BigDecimal;

@Entity
public class Request {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false, length = 20)
    private String horaPedida;

    @NotBlank
    @Column(nullable = false, length = 20)
    private String horaServicio;

    @NotBlank
    @Column(nullable = false, length = 12)
    private String estado;

    @NotBlank 
    @Column(nullable = false, length = 200)
    private String descripcion;

    @NotBlank
    @Column(nullable = false, length = 50)
    private String ubicacion;

    @NotBlank 
    @Column(nullable = false)
    private Long username_id_creator;

    @NotBlank 
    @Column(nullable = false)
    private Long username_id_receiver;

    public Request(){

    }

    public Long getId(){
        return this.id;
    }

    public String getHoraPedida(){
        return this.horaPedida;
    }

    public void setHoraPedida(String horaNueva){
        this.horaPedida = horaNueva;
    }

    public String getHoraServicio(){
        return this.horaServicio;
    }

    public void setHoraServicio(String horaNueva){
        this.horaServicio = horaNueva;
    }

    public String getEstado(){
        return this.estado;
    }

    public void setEstado(String nuevoEstado){
        this.estado = nuevoEstado;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public void setDescripcion(String des){
        this.descripcion = des;
    }

    public String getUbicacion(){
        return this.ubicacion;
    }

    public void setUbicacion(String newUbi){
        this.ubicacion = newUbi;
    }

    public Long getUsername_id_creator(){
        return this.username_id_creator;
    }

    public void setUsername_id_creator(Long newId){
        this.username_id_creator = newId;
    }

    public Long getusername_id_receiver(){
        return this.username_id_receiver;
    }

    public void setUsername_id_receiver(Long newId){
        this.username_id_receiver = newId;
    }
}
