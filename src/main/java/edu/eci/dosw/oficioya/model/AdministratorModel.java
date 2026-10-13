package edu.eci.dosw.oficioya.model;

/**
 * Representa el rol de administrador de un usuario dentro del sistema OficioYa.
 */
public class AdministratorModel {
    private Long id;
    public AdministratorModel() {
    }
    public Long getId(){
        return this.id;
    }

    public void setId(Long newId){
        this.id = newId;
    }
}