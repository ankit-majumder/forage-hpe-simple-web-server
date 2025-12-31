package com.example.simple_web_server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
@RestController
@RequestMapping("/employees")
public class Controller {
    @Autowired
    private DAO employeeDao;

    @GetMapping("")
    public Employees returnEmployees(){
        return employeeDao.getEmployees();
    }


}
