package com.springboot.practicasprof.services;

import com.springboot.practicasprof.entity.Alumno;

import java.util.List;

public interface IAlumnoService {
    public List<Alumno> findAll();
}
