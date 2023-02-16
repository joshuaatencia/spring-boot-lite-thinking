package com.ejercicio.registro.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name = "usuario")
public class Usuario {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String user;

    private String password;

    private Boolean active;

}
