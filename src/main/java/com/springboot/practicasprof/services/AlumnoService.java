package com.springboot.practicasprof.services;

import com.springboot.practicasprof.dao.IAlumnoDao;
import com.springboot.practicasprof.entity.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service //?
public class AlumnoService implements IAlumnoService {
    @Autowired // inyecta IalumnoDao
    private IAlumnoDao alumnoDao; // IAlumnoDao esta el CRUD REPOSITORY
    @Override
    @Transactional(readOnly = true) //select en mysql
    public List<Alumno> findAll() {
        return (List<Alumno>) alumnoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Alumno findById(Long id) {
        return alumnoDao.findById(id).orElse(null); //orElse, si no lo encuentra retorna un null
    }

    @Override
    @Transactional
    public Alumno save(Alumno alumno) {
        return alumnoDao.save(alumno);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        alumnoDao.deleteById(id);
    }
}
