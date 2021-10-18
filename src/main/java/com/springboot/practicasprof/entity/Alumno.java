package com.springboot.practicasprof.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

//creo la clase entidad
@Entity
//creo la tabla con el nombre alumno
@Table(name="alumnos")
public class Alumno implements Serializable { // sirve  para especificar quetodo el estado de un objeto podrá ser escrito o enviado en la red
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // identity para que la primary key se de de forma incremental
    private long id;
    @NotEmpty
    @Column(nullable = false)
    private int dni;
    @NotEmpty
    @Column(nullable = false)
    private String nombre;
    @NotEmpty
    @Column(nullable = false)
    private String apellido;
    @NotEmpty
    @Column(nullable = false)
    private String fecha_nac;
    private char sexo;
    private String obra_social;
    private boolean cal_vac;
    private String alergias;
    private int telefono;
    private String email;
    private String medicacion;

    public Alumno() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMedicacion() {
        return medicacion;
    }

    public void setMedicacion(String medicacion) {
        this.medicacion = medicacion;
    }

    public String getObra_social() {
        return obra_social;
    }

    public void setObra_social(String obra_social) {
        this.obra_social = obra_social;
    }

    public boolean isCal_vac() {
        return cal_vac;
    }

    public void setCal_vac(boolean cal_vac) {
        this.cal_vac = cal_vac;
    }

    public boolean getCal_Vac() {
        return false;
    }
}