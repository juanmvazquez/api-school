package com.springboot.practicasprof.controllers;

import com.springboot.practicasprof.entity.Docente;
import com.springboot.practicasprof.services.IDocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DocenteController {

    @Autowired
    private IDocenteService docenteService;

    @GetMapping("/docente")
    public List<Docente> index(){
        return docenteService.findAll();
    }

}
