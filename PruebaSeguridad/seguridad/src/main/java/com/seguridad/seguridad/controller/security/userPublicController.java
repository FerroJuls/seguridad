package com.seguridad.seguridad.controller.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seguridad.seguridad.interfaceService.IusuarioService;
import com.seguridad.seguridad.models.Usuario;
import com.seguridad.seguridad.models.seguridad.authResponse;
import com.seguridad.seguridad.models.seguridad.loginRequest;

import org.springframework.web.bind.annotation.GetMapping;


@RequestMapping("/api/v1/public/usuario/")
@RestController
public class userPublicController {
    // crear los metodos de login register
    
    @Autowired
    private IusuarioService usuarioService;

    // register
    @PostMapping("/")
    public ResponseEntity<Object> save (@ModelAttribute("Usuario") Usuario Usuario) {
        
        usuarioService.save(Usuario);
        return new ResponseEntity<>(Usuario, HttpStatus.OK);
    }

    // login
    @GetMapping("login")
    public ResponseEntity<authResponse> login(@RequestBody loginRequest request) {
        authResponse response=new authResponse();
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @GetMapping("/forgot-password/")
    public ResponseEntity<Object> forgot_password() {
        // falta desarrollar
        return new ResponseEntity<>("",HttpStatus.OK);
    }


    @GetMapping("/{traerUser}/")
    public ResponseEntity<Object> findFiltro(@PathVariable String traerUser) {
        var listaUsuario = usuarioService.traerUsuario(traerUser);
        return new ResponseEntity<>(listaUsuario, HttpStatus.OK);
    }
    
}
