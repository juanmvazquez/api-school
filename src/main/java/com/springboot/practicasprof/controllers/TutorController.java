package com.springboot.practicasprof.controllers;

import com.springboot.practicasprof.entity.Tutor;
import com.springboot.practicasprof.services.ITutorService;
import com.springboot.practicasprof.services.TutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//    generamos la url/endpoint
@RequestMapping("/api")
public class TutorController {
    @Autowired
    private ITutorService tutorService;
//    mapeo la url /tutor me trae todos los tutores
    @GetMapping("/tutores")
    public List<Tutor> index() {
        return tutorService.findAll();
    }

//    busqueda por ID
//    @PathVariable, es cuando nos referimos a datos incluidos.
    @GetMapping("/tutores/{id}")
    public Tutor show(@PathVariable Long id){
        return tutorService.findById(id);
    }

    @PostMapping("/tutores")
//    da un estado 201 que indica que se creo el contenido
    @ResponseStatus(HttpStatus.CREATED)
    public Tutor create (@RequestBody Tutor tutor){
        return tutorService.save(tutor);
    }

//    Put:Actualiza
    @PutMapping("/tutores/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Tutor update(@RequestBody Tutor tutor, @PathVariable Long id){
        Tutor tutorActual = tutorService.findById(id);

        tutorActual.setDni1(tutor.getDni1());
        tutorActual.setNombreApellido1(tutor.getNombreApellido1());
        tutorActual.setTelefono1(tutor.getTelefono1());
        tutorActual.setParentesto1(tutor.getParentesto1());

        tutorActual.setDni2(tutor.getDni2());
        tutorActual.setNombreApellido2(tutor.getNombreApellido2());
        tutorActual.setTelefono2(tutor.getTelefono2());
        tutorActual.setParentesto2(tutor.getParentesto2());

        return tutorService.save(tutorActual);
    }

//    Delete:Borra
    @DeleteMapping("/tutores/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete (@PathVariable Long id){
        tutorService.delete(id);
    }

}
