package com.seguridad.seguridad.models;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

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
public class Usuario implements UserDetails{
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

    @Column(name = "Enabled", nullable = true)
    private boolean Enabled;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(this.Rol.name()));
    }

    @Override
    public String getPassword() {
        return "";
    }

    @Override
    public String getUsername() {
        return this.correoElectronicoUnico;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.Enabled;
    }

}