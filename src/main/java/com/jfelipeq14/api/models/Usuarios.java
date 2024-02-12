package com.jfelipeq14.api.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Usuarios {
    @Id
    @GeneratedValue
    private Integer id;

    @Basic
    private String nombre;
    private String apellido;
    private String correo;
}
