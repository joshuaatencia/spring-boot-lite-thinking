package com.ejercicio.registro.controller;


import com.ejercicio.registro.entity.Usuario;
import com.ejercicio.registro.service.IUsuarioService;
import org.aspectj.bridge.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;


    @GetMapping("/")
    public ResponseEntity<?> findAll() {
        List<Usuario> usuarios = new ArrayList<>();

        try {
          usuarios = this.usuarioService.findAll();
        }catch (DataAccessException ignored){
            return new ResponseEntity<>(usuarios, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>(usuarios,HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Usuario usuario){



        try {
            this.usuarioService.save(usuario);
        }catch (Exception e){

            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }


        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody Usuario usuario){

        try {
            System.out.println(usuario);
            this.usuarioService.update(usuario);
        }catch (Exception e){

            return new ResponseEntity<>( HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/delete")
    public ResponseEntity<?> delete(@RequestBody Usuario usuario){

        try {

            this.usuarioService.delete(usuario);
        }catch (Exception e){

            return new ResponseEntity<>( HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
