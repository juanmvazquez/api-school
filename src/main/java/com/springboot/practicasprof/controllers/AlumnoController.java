package com.springboot.practicasprof.controllers;


import com.springboot.practicasprof.entity.Alumno;
import com.springboot.practicasprof.services.IAlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api") //generamos la url/endpoint
public class AlumnoController {

    @Autowired
    private IAlumnoService alumnoService;

    @GetMapping("/alumnos") //mapeo la url /alumnos me trae todos los alumnos
    public List<Alumno> index(){
        return alumnoService.findAll();

    }
}
