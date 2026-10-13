package edu.eci.dosw.oficioya.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @NotBlank
    @Column(nullable = false)
    private String nombre;

    @Column(columnDefinition = "json")
    private String foto;

    @Email
    @NotBlank
    @Column(nullable = false, length = 150)
    private String correo;

    @NotBlank
    @Column(nullable = false, length = 15)
    private String telefono;

    @Column(name = "rating")
    private Double calificacion;

    @Column(name = "contraseña")
    private String contrasena;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "subscription_id")
    private UserSubscription suscripcion;

    @OneToOne
    private Worker worker;

    @OneToOne 
    private Administrator admin;

    @OneToOne
    private Contractor contractor;

    public User(){

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

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public UserSubscription getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(UserSubscription suscripcion) {
        this.suscripcion = suscripcion;
    }
    public void setWorker(Worker w){
        this.worker = w;
    }

    public Worker getWorker(){
        return this.worker;
    }
    public Administrator getAdmin() {
        return admin;
    }

    public void setAdmin(Administrator admin) {
        this.admin = admin;
    }

    public Contractor getContractor() {
        return contractor;
    }

    public void setContractor(Contractor contractor) {
        this.contractor = contractor;
    }
}
