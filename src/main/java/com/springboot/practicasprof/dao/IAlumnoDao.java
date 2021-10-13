package com.springboot.practicasprof.dao;

import com.springboot.practicasprof.entity.Alumno;
import org.springframework.data.repository.CrudRepository;

public interface IAlumnoDao extends CrudRepository <Alumno, Long> {
}
