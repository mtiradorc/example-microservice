package com.gian.registry.repository;

import com.gian.registry.DTO.ClienteDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  clienteRepository  extends JpaRepository<ClienteDto, Long> {

}
