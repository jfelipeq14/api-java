package com.jfelipeq14.api.services;

import org.springframework.stereotype.Service;

import com.jfelipeq14.api.models.Usuarios;
import com.jfelipeq14.api.repositories.UsuariosRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuariosService {

    private final UsuariosRepository usuariosRepository;

    public void createUsuario(Usuarios usuario) {
        usuariosRepository.save(usuario);
    }

    public void deleteUsuario(Usuarios usuario) {
        usuariosRepository.deleteById(usuario.getId());
    }

    public void getUsuarioById(int id) {
        System.out.println(usuariosRepository.findById(id));
    }

    public void updateUsuario(Integer id, Usuarios usuario) {
        var exist = usuariosRepository.existsById(id);
        if (exist) {
            usuariosRepository.save(usuario);
        }

    }

}
