package com.seguridad.seguridad.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "idUsuario", nullable = false, length = 36)
    private String idUsuario ;

    @Column(name = "primerNombre", nullable = false, length = 36)
    private String primerNombre;
 
    @Column(name = "primerApellido", nullable = false, length = 36)
    private String primerApellido;

    @Column(name = "correoElectronicoUnico", nullable = false, length = 100)
    private String correoElectronicoUnico;

    @Column(name = "Contrasena", nullable = false, length = 100)
    private String Contrasena;

    @Column(name = "confirmarContrasena", nullable = false, length = 100)
    private String confirmarContrasena;

    @Column(name = "Telefono", nullable = false, length = 11)
    private String Telefono;

    @Column(name = "Rol", nullable = false, length = 36)
    private String Rol;

    public Usuario() {
    }

    public Usuario(String idUsuario, String primerNombre, String primerApellido, String correoElectronicoUnico,
            String contrasena, String confirmarContrasena, String telefono, String rol) {
        this.idUsuario = idUsuario;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.correoElectronicoUnico = correoElectronicoUnico;
        Contrasena = contrasena;
        this.confirmarContrasena = confirmarContrasena;
        Telefono = telefono;
        Rol = rol;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getCorreoElectronicoUnico() {
        return correoElectronicoUnico;
    }

    public void setCorreoElectronicoUnico(String correoElectronicoUnico) {
        this.correoElectronicoUnico = correoElectronicoUnico;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String contrasena) {
        Contrasena = contrasena;
    }

    public String getConfirmarContrasena() {
        return confirmarContrasena;
    }

    public void setConfirmarContrasena(String confirmarContrasena) {
        this.confirmarContrasena = confirmarContrasena;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String rol) {
        Rol = rol;
    }

    

    
}