package com.gian.msloginexample.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = UserDto.TABLE_NAME)
public class UserDto {

    public static final String TABLE_NAME= "usuario";
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "usuario")
    private String usuario;

    @Column(name = "password")
    private String password;

}
