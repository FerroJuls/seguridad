package com.seguridad.seguridad.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.seguridad.seguridad.interfaceService.IusuarioService;
import com.seguridad.seguridad.interfaces.Iusuario;
import com.seguridad.seguridad.models.Usuario;
import com.seguridad.seguridad.models.seguridad.authResponse;
import com.seguridad.seguridad.models.seguridad.loginRequest;
import com.seguridad.seguridad.service.jwt.jwtServices;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class usuarioService implements IusuarioService {
    @Autowired
    private Iusuario data;

    // se implementa los servicips de jwtService

    private final jwtServices datajwt;
    // se implementa el administrador de autenticacion
    private final AuthenticationManager authenticationManager;
    // se implementa el servicio de encriptacion claves
    private final PasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
    
    @Override
    public String save(Usuario Usuario) {
        data.save(Usuario);
        return Usuario.getIdUsuario();
    }

    @Override
    public authResponse login(loginRequest request){
        
    }

    @Override
    public List<Usuario> findAll() {
        List<Usuario> listaUsuario = (List<Usuario>) data.findAll();
        return listaUsuario;
    }

    @Override
    public Optional<Usuario> findOne(String id) {
        Optional<Usuario> Usuario = data.findById(id);
        return Usuario;
    }

    @Override
    public int delete(String id) {
        data.deleteById(id);
        return 1;
    }
}
