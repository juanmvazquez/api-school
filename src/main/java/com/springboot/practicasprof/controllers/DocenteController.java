package com.springboot.practicasprof.controllers;

import com.springboot.practicasprof.entity.Docente;
import com.springboot.practicasprof.services.IDocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//    generamos la url/endpoint
@RequestMapping("/api")
public class DocenteController {

    @Autowired
    private IDocenteService docenteService;
//    mapeo la url /docente me trae todos los docente
    @GetMapping("/docentes")
    public List<Docente> index(){
        return docenteService.findAll();
    }

//    busqueda por ID
//    @PathVariable, es cuando nos referimos a datos incluidos.
    @GetMapping("/docentes/{id}")
    public Docente show(@PathVariable Long id){
        return docenteService.findById(id);
    }

    @PostMapping("/docentes")
//    da un estado 201 que indica que se creo el contenido
    @ResponseStatus(HttpStatus.CREATED)
    public Docente create(@RequestBody Docente docente){
        return docenteService.save(docente);
    }

//    Put:Actualiza
    @PutMapping("/docentes/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Docente update(@RequestBody Docente docente, @PathVariable Long id){
        Docente docenteActual = docenteService.findById(id);

        docenteActual.setNombre(docente.getNombre());
        docenteActual.setApellido(docente.getApellido());
        docenteActual.setFecha(docente.getFecha());
        docenteActual.setSexo(docente.getSexo());
        docenteActual.setDireccion(docente.getDireccion());
        docenteActual.setTelefono(docente.getTelefono());
        docenteActual.setObraSocial(docente.getObraSocial());
        docenteActual.setArt(docente.getArt());
        docenteActual.setProfesion(docente.getProfesion());
        docenteActual.setMatricula(docente.getMatricula());
        docenteActual.setEmail(docente.getEmail());

        return docenteService.save(docenteActual);
    }

//    Delete:Borra
    @DeleteMapping("/docentes/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        docenteService.delete(id);
    }
}
