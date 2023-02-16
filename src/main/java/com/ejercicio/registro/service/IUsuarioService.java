package com.ejercicio.registro.service;

import com.ejercicio.registro.entity.Usuario;

import java.util.List;

public interface IUsuarioService {
    List<Usuario> findAll();

    void save(Usuario usuario);

    void update(Usuario usuario);

    void delete(Usuario usuario);
}
