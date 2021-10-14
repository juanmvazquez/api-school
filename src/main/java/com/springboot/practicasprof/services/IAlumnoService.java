package com.springboot.practicasprof.services;

import com.springboot.practicasprof.entity.Alumno;

import java.util.List;

public interface IAlumnoService {
    public List<Alumno> findAll();

    public Alumno findById (Long id);

    public Alumno save (Alumno alumno);

    public void delete (Long id);

}
