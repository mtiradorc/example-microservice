package com.gian.registry.DTO;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = UserDto.TABLE_NAME)
public class UserDto {

    public static final String TABLE_NAME= "USUARIO";

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "usuario")
    private String usuario;

    @Column(name = "password")
    private String password;

}
