package edu.eci.dosw.oficioya.model;

import java.time.LocalDateTime;

/**
 * Representa una solicitud de servicio realizada por un usuario.
 */
public class RequestModel {

    private LocalDateTime horaPedida;
    private LocalDateTime horaServicio;
    private RequestStateModel estado;
    private String descripcion;
    //private String foto;
    private String ubicacion;
    private Long username_id_creator;
    private Long username_id_receiver;

    public RequestModel() {
    }

    public LocalDateTime getHoraPedida() {
        return horaPedida;
    }

    public void setHoraPedida(LocalDateTime horaPedida) {
        this.horaPedida = horaPedida;
    }

    public LocalDateTime getHoraServicio() {
        return horaServicio;
    }

    public void setHoraServicio(LocalDateTime horaServicio) {
        this.horaServicio = horaServicio;
    }

    public RequestStateModel getEstado() {
        return estado;
    }

    public void setEstado(RequestStateModel estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /* 
    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
        */

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setUsername_id_creator(Long id){
        this.username_id_creator = id;
    }

    public Long getUsername_id_creator(){
        return this.username_id_creator;
    }

    public void setUsername_id_receiver(Long id){
        this.username_id_receiver = id;
    }

    public Long getusername_id_receiver(){
        return this.username_id_receiver;
    }
}