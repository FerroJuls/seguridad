package com.seguridad.seguridad.interfaceService;

import java.util.List;
import java.util.Optional;

import com.seguridad.seguridad.models.Usuario;
import com.seguridad.seguridad.models.seguridad.authResponse;
import com.seguridad.seguridad.models.seguridad.loginRequest;

public interface IusuarioService {

    public String save (Usuario Usuario);

    // se define el metodo del login
    public authResponse login(loginRequest request);

    public List<Usuario> traerUsuario(String traerUser);

    public List<Usuario> findAll();

    public Optional<Usuario> findOne(String id);

    public int delete(String id);


}