package com.seguridad.seguridad.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.seguridad.seguridad.models.Usuario;

@Repository
public interface Iusuario extends CrudRepository<Usuario, String> {

      
}
