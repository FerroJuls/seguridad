package com.seguridad.seguridad.service.jwt;

import java.security.Key;
import java.util.Date;
import java.util.Map;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class jwtServices {
    // la clase jwtServices sirve para:
    // Generar los token verificar la valiez del token extraer la informacion ncluida en el token 

    // metodos para generar token 
    @SuppressWarnings("deprecation")
    public String getToken(
        Map<String,Object>extraClaims,
        UserDetails user
        //claims
        // informacion adicional que se incluye en el token
    ){
        return Jwts
        .builder()//constructor
        .setClaims(extraClaims)//agregar los elementos adicionales
        .setSubject(user.getUsername())//guarda el username dentro del token 
        .setIssuedAt(new Date(System.currentTimeMillis()))//fecha de emision del token
        .setExpiration(new Date(System.currentTimeMillis()+1000*60*60)) //tiempo de vencimiento
        .signWith(getKey(),SignatureAlgorithm.HS256)//
        .compact()
        ;
    }
    private static final String secretKey="1CCxUrixg/pr/s2HjdRQ2gSC0oAWphH/XU3HTbRDKic=";
    // Metodo para generar la clave
    private Key getKey(){
        // Decoders 
        byte[] KeyBytes=Decoders.BASE64.decode(secretKey);
        return Keys.hmacShaKeyFor(KeyBytes);
    }

}
