package com.springboot.practicasprof.services;

import com.springboot.practicasprof.entity.Docente;
import java.util.List;

public interface IDocenteService {

    public List<Docente> findAll();

    public Docente findById(Long id);

    public Docente save(Docente docente);

    public void delete(Long id);
}
