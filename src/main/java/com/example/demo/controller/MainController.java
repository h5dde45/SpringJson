package com.example.demo.controller;

import com.example.demo.entity.Manager;
import com.example.demo.repository.ManagerRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private ManagerRepository managerRepository;

    @RequestMapping("/")
    public List<Manager> defaultUrl(){
        return Lists.newArrayList(managerRepository.findAll());
    }
}
