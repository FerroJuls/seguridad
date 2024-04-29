package com.seguridad.seguridad.interfaceService;

import java.util.List;
import java.util.Optional;

import com.seguridad.seguridad.models.Usuario;

public interface IusuarioService {

    public String save (Usuario Usuario);

    public List<Usuario> findAll();

    public Optional<Usuario> findOne(String id);

    public int delete(String id);


}