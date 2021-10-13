package com.springboot.practicasprof.dao;

import com.springboot.practicasprof.entity.Docente;
import org.springframework.data.repository.CrudRepository;

public interface IDocenteDao extends CrudRepository<Docente,Long> {
}
