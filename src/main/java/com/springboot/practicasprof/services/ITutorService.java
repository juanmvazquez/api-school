package com.springboot.practicasprof.services;

import com.springboot.practicasprof.entity.Tutor;

import java.util.List;

public interface ITutorService {
    public List<Tutor> findAll();

    public Tutor findById (Long id);

    public Tutor save (Tutor tutor);

    public void delete (Long id);

}
