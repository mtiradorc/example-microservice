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
    @Column(name = "ID")
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(name = "APELLIDO")
    private String apellido;

    @Column(name = "CREATE_AT")
    private Date create_at;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "NOMBRE")
    private String nombre;



}
