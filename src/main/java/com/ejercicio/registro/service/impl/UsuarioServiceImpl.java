package com.ejercicio.registro.service.impl;

import com.ejercicio.registro.entity.Usuario;
import com.ejercicio.registro.repository.UsuarioRepository;
import com.ejercicio.registro.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll() {
        return this.usuarioRepository.findAll();
    }

    @Override
    public void save(Usuario usuario) {
        this.usuarioRepository.save(usuario);
    }

    @Override
    public void update(Usuario usuario) {
       this.usuarioRepository.save(usuario);
    }

    @Override
    public void delete(Usuario usuario) {
        this.usuarioRepository.delete(usuario);
    }
}
