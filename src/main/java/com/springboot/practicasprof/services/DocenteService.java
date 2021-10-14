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
    @Transactional(readOnly = true)
    public List<Docente> findAll() {
        return (List<Docente>) docenteDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Docente findById(Long id) {
        return docenteDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Docente save(Docente docente) {
        return docenteDao.save(docente);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        docenteDao.deleteById(id);
    }
}
