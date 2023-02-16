package com.ejercicio.registro.repository;

import com.ejercicio.registro.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query(value = "update\n" +
            "\tpublic.usuario\n" +
            "set\n" +
            "\t\"user\" = ?1,\n" +
            "\t\"password\" = ?2,\n" +
            "\tactive = true\n" +
            "where\n" +
            "\tid = nextval('2'::regclass)", nativeQuery = true)
    void update(String user, String password);
}
