package com.seguridad.seguridad.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


// GET AND SETER AND CONSTRUCTOR
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
    private Rol Rol;

    @Column(name = "Estado", nullable = false, length = 36)
    private String Estado;

}