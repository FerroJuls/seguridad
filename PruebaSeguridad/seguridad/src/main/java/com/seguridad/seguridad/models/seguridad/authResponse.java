package com.seguridad.seguridad.models.seguridad;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// GET AND SETER AND CONSTRUCTOR
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class authResponse {
    
    // Este archivo contiene la respuesta cuendo el usuario inicia secion
    // cuando se inicia sesion se debe retornar el token
    String status;
    String message;
    String token;
    
}
