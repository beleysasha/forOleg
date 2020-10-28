package org.example.controller;

import org.example.repository.User;
import org.example.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MyController {
    private final Service service;
    @Autowired
    public MyController(Service service) {
        this.service = service;
    }

    @GetMapping
    public Iterable<User> getAll() {
        return service.getAll();
    }


}
