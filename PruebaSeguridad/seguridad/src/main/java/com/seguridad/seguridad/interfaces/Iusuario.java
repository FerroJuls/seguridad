package com.seguridad.seguridad.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.seguridad.seguridad.models.Usuario;

@Repository
public interface Iusuario extends CrudRepository<Usuario, String> {

    @Query("SELECT u FROM Usuario u WHERE u.correoElectronicoUnico LIKE %?1%")
    List<Usuario> traerUsuario(String traerUser);

}
