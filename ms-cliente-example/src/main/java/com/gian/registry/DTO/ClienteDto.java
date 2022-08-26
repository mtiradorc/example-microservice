package com.gian.registry.DTO;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = ClienteDto.TABLE_NAME)
public class ClienteDto {
    public static final String TABLE_NAME= "CLIENTE";

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "create_at")
    private Date create_at;

    @Column(name = "email")
    private String email;

    @Column(name = "nombre")
    private String nombre;



}
