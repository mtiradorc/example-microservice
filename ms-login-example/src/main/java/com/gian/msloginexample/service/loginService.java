package com.gian.msloginexample.service;

import com.gian.msloginexample.dto.UserDto;
import com.gian.msloginexample.repository.loginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class loginService {

    @Autowired
    private loginRepository loginRepository;

    public List<UserDto> listAll(){
        return loginRepository.findAll();
    }
}
