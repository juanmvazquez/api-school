package com.springboot.practicasprof.controllers;


import com.springboot.practicasprof.entity.Alumno;
import com.springboot.practicasprof.services.IAlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//    generamos la url/endpoint
@RequestMapping("/api")
public class AlumnoController {

    @Autowired
    private IAlumnoService alumnoService;

//    mapeo la url /alumnos me trae todos los alumnos
    @GetMapping("/alumnos")
    public List<Alumno> index(){
        return alumnoService.findAll();
    }

//    busqueda por ID
//    @PathVariable, es cuando nos referimos a datos incluidos.
    @GetMapping("/alumnos/{id}")
    public Alumno show(@PathVariable Long id){
        return alumnoService.findById(id);
    }
//    Post:Crea
//    @RequestBody envia al alumno en formato json asi spring lee los datos y lo mapea
    @PostMapping("/alumnos")
//    da un estado 201 que indica que se creo el contenido
    @ResponseStatus(HttpStatus.CREATED)
    public Alumno create(@RequestBody Alumno alumno){
        return alumnoService.save(alumno);
    }
//    Put:Actualiza
    @PutMapping("/alumnos/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Alumno update(@RequestBody Alumno alumno, @PathVariable Long id){
        Alumno alumnoActual = alumnoService.findById(id);

        alumnoActual.setNombre(alumno.getNombre());
        alumnoActual.setApellido(alumno.getApellido());
        alumnoActual.setFecha_nac(alumno.getFecha_nac());
        alumnoActual.setSexo(alumno.getSexo());
        alumnoActual.setAlergias(alumno.getAlergias());
        alumnoActual.setTelefono(alumno.getTelefono());
        alumnoActual.setEmail(alumnoActual.getEmail());
        alumnoActual.setMedicacion(alumnoActual.getMedicacion());

        return alumnoService.save(alumnoActual);
    }
//    Delete:Borra
    @DeleteMapping("/alumnos/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        alumnoService.delete(id);
    }
}
