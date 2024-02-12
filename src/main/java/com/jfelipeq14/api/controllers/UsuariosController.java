package com.jfelipeq14.api.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.jfelipeq14.api.models.Usuarios;
import com.jfelipeq14.api.services.UsuariosService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UsuariosController {
    private final UsuariosService usuariosService;

    @PostMapping
    public void createUsuarios(@RequestBody Usuarios usuario) {
        usuariosService.createUsuario(usuario);
    }

}
