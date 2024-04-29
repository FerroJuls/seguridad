package com.seguridad.seguridad.models.seguridad;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class loginRequest {
    
    /* Contiene la e
    scritura de la peticion 
    de inicio de sesion  */

    String userName;
    String password;
}
