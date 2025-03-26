package com.gian.registry.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import com.gian.registry.DTO.UserDto;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = ClienteDto.TABLE_NAME)
@Data
public class ClienteDto {
    public static final String TABLE_NAME= "CLIENTE";

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "create_at")
    private Date fechaRegistro;

    @Column(name = "email")
    private String correo;

    @Column(name = "nombre")
    private String nombre;

    @OneToOne
    @JoinColumn(name = "id_usuario")
    private UserDto usuario;

}
