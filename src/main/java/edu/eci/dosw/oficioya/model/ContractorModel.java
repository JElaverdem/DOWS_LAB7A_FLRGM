package edu.eci.dosw.oficioya.model;

/**
 * Representa el rol de contratante de un usuario dentro del sistema OficioYa.
 */
public class ContractorModel {
    private Long id;
    
    public ContractorModel() {
    }
    public Long getId(){
        return this.id;
    }

    public void setId(Long newId){
        this.id = newId;
    }
}