package edu.eci.dosw.oficioya.model;

import java.util.ArrayList;

/**
 * Representa el rol de trabajador de un usuario dentro del sistema OficioYa.
 * Contiene la información relacionada con el oficio que ofrece.
 */
public class WorkerModel {

    private String oficioPrincipal;
    //private ArrayList<String> oficiosSecundarios;
    //private ArrayList<String> cobertura;
    private Long tarifa;
    private AvailabilityModel disponibilidad;
    private int trabajosCompletados;
    //private ArrayList<String> galeriaTrabajos;

    public WorkerModel() {
        //this.oficiosSecundarios = new ArrayList<>();
        //this.cobertura = new ArrayList<>();
        //this.galeriaTrabajos = new ArrayList<>();
        this.disponibilidad = AvailabilityModel.ACTIVE;
        this.trabajosCompletados = 0;
    }

    public String getOficioPrincipal() {
        return oficioPrincipal;
    }

    public void setOficioPrincipal(String oficioPrincipal) {
        this.oficioPrincipal = oficioPrincipal;
    }
    /* 
    public ArrayList<String> getOficiosSecundarios() {
        return oficiosSecundarios;
    }

    public void setOficiosSecundarios(ArrayList<String> oficiosSecundarios) {
        this.oficiosSecundarios = oficiosSecundarios;
    }

    public ArrayList<String> getCobertura() {
        return cobertura;
    }

    public void setCobertura(ArrayList<String> cobertura) {
        this.cobertura = cobertura;
    }
    */
    public Long getTarifa() {
        return tarifa;
    }

    public void setTarifa(Long tarifa) {
        this.tarifa = tarifa;
    }

    public AvailabilityModel getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(AvailabilityModel disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getTrabajosCompletados() {
        return trabajosCompletados;
    }

    public void setTrabajosCompletados(int trabajosCompletados) {
        this.trabajosCompletados = trabajosCompletados;
    }
    /*
    public ArrayList<String> getGaleriaTrabajos() {
        return galeriaTrabajos;
    }

    public void setGaleriaTrabajos(ArrayList<String> galeriaTrabajos) {
        this.galeriaTrabajos = galeriaTrabajos;
    }
    */
}