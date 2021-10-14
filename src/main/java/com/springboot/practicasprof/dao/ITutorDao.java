package com.springboot.practicasprof.dao;

import com.springboot.practicasprof.entity.Tutor;
import org.springframework.data.repository.CrudRepository;

public interface ITutorDao extends CrudRepository <Tutor,Long> {
}
