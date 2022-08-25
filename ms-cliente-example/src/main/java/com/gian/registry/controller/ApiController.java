package com.gian.registry.controller;

import com.gian.registry.DTO.ClienteDto;
import com.gian.registry.service.clienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private clienteService clienteService;

    @GetMapping("/cliente")
    public ResponseEntity<?>  allClient (){
        Map<String, Object> param = new HashMap<>();
        List<ClienteDto> clienteDto = clienteService.listAll();
        param.put("cliente", clienteDto);

        return new ResponseEntity<Object>(param, HttpStatus.OK);
    }

    @GetMapping("/cliente/{id}")
    public ResponseEntity<?>  clienteById (@PathVariable Long id){
        Map<String, Object> param = new HashMap<>();
        try {
            ClienteDto clienteDto = clienteService.clienteById(id);
            param.put("cliente", clienteDto);

        }catch (Exception e){

        }

        return new ResponseEntity<Object>(param, HttpStatus.OK);
    }
}