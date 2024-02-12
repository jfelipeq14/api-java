package com.jfelipeq14.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jfelipeq14.api.models.Usuarios;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios, Integer> {

}
