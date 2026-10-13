package edu.eci.dosw.oficioya.model;

import java.util.ArrayList;

/**
 * Representa un usuario del sistema OficioYa.
 * Un usuario puede tener asociado un rol de Worker, Contractor y/o Administrator.
 */
public class UserModel {

    private Long id;
    private String nombre;
    private String foto;
    private String correo;
    private String telefono;
    private String contrasena;
    private double calificacion;
    private UserSubscriptionModel suscripcion;
    //private ArrayList<Review> resenasObtenidas;
    //private ArrayList<RequestModel> requests;
    private ContractorModel contractor;
    private WorkerModel worker;
    private AdministratorModel admin;

    public UserModel() {
        //this.resenasObtenidas = new ArrayList<>();
        //this.requests = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public UserSubscriptionModel getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(UserSubscriptionModel suscripcion) {
        this.suscripcion = suscripcion;
    }
    /*
    public ArrayList<Review> getResenasObtenidas() {
        return resenasObtenidas;
    }

    public void setResenasObtenidas(ArrayList<Review> resenasObtenidas) {
        this.resenasObtenidas = resenasObtenidas;
    }

    public ArrayList<RequestModel> getRequests() {
        return requests;
    }

    public void setRequests(ArrayList<RequestModel> requests) {
        this.requests = requests;
    }
    */

    public ContractorModel getContractor() {
        return contractor;
    }

    public void setContractor(ContractorModel contractor) {
        this.contractor = contractor;
    }

    public WorkerModel getWorker() {
        return worker;
    }

    public void setWorker(WorkerModel worker) {
        this.worker = worker;
    }

    public AdministratorModel getAdmin() {
        return admin;
    }

    public void setAdmin(AdministratorModel admin) {
        this.admin = admin;
    }
}