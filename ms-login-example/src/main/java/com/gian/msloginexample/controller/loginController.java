package com.gian.msloginexample.controller;

import com.gian.msloginexample.dto.UserDto;
import com.gian.msloginexample.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class loginController {

    @Autowired
    private loginService loginService;

    @GetMapping("/user")
    public ResponseEntity<Object> allUser (){
        Map<String, Object> param = new HashMap<>();
        List<UserDto> usersDto = loginService.listAll();
        param.put("usuario", usersDto);
        return new ResponseEntity<Object>(param, HttpStatus.OK);
    }
}
