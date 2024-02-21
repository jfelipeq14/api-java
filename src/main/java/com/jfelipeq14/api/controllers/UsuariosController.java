package com.jfelipeq14.api.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.jfelipeq14.api.models.Usuarios;
import com.jfelipeq14.api.services.UsuariosService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UsuariosController {
    private final UsuariosService usuariosService;

    @PostMapping
    public void createUsuarios(@RequestBody Usuarios usuario) {
        usuariosService.createUsuario(usuario);
    }

    @GetMapping("/getById/{id}")
    public void getUsuarioById(@PathVariable String id) {
        usuariosService.getUsuarioById(Integer.parseInt(id));
    }

    @PutMapping("/update/{id}")
    public void updateUsuario(@PathVariable String id, @RequestBody Usuarios usuario) {
        usuariosService.updateUsuario(Integer.parseInt(id), usuario);
    }
}
