package com.seguridad.seguridad.controller.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seguridad.seguridad.interfaceService.IusuarioService;
import com.seguridad.seguridad.models.Usuario;

@RequestMapping("/api/v1/public/usuario/")
@RestController
public class userController {
    @Autowired
    private IusuarioService usuarioService;

    @PostMapping("/")
    public ResponseEntity<Object> save (@ModelAttribute("Usuario") Usuario Usuario) {
        
        usuarioService.save(Usuario);
        return new ResponseEntity<>(Usuario, HttpStatus.OK);
    }

     @GetMapping("/")
    public ResponseEntity<Object> findAll() {
        var listaUsuario = usuarioService.findAll();
        return new ResponseEntity<>(listaUsuario, HttpStatus.OK);
    }

     @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable String id) {
    usuarioService.delete(id);
    return new ResponseEntity<>("Registro eliminado", HttpStatus.OK);
    }

     @PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable String id, @ModelAttribute("Usuario") Usuario UsuarioUpdate) {
        var Usuario = usuarioService.findOne(id).get();
        if (Usuario != null) {

            Usuario.setPrimerNombre(UsuarioUpdate.getPrimerNombre());
            Usuario.setPrimerApellido(UsuarioUpdate.getPrimerApellido());
            Usuario.setCorreoElectronicoUnico(UsuarioUpdate.getCorreoElectronicoUnico());
            Usuario.setContrasena(UsuarioUpdate.getContrasena());
            Usuario.setConfirmarContrasena(UsuarioUpdate.getConfirmarContrasena());
            Usuario.setTelefono(UsuarioUpdate.getTelefono());
            Usuario.setRol(UsuarioUpdate.getRol());
           
          
            usuarioService.save(Usuario);
            return new ResponseEntity<>(Usuario, HttpStatus.OK);

        } else {
            return new ResponseEntity<>("Error usuario NO Encontrado", HttpStatus.BAD_REQUEST);
        }
    }
}
