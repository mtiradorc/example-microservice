package com.gian.registry.service;

import com.gian.registry.DTO.ClienteDto;
import com.gian.registry.repository.clienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class clienteService {

    @Autowired
    private clienteRepository clienteRepository;

    public List<ClienteDto> listAll(){
        return clienteRepository.findAll();
    }

    public ClienteDto clienteById(Long id){
        return clienteRepository.findById(id).get();
    }
}
