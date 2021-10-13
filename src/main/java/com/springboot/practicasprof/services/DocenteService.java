package com.springboot.practicasprof.services;


import com.springboot.practicasprof.dao.IDocenteDao;
import com.springboot.practicasprof.entity.Docente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class DocenteService implements IDocenteService  {

    @Autowired // inyecta IalumnoDao
    private IDocenteDao docenteDao; // IAlumnoDao esta el CRUD REPOSITORY
    @Override
    @Transactional
    public List<Docente> findAll() {
        return (List<Docente>) docenteDao.findAll();
    }
}
