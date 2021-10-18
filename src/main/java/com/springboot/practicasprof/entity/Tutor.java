package com.springboot.practicasprof.entity;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

//creo la clase entidad
@Entity
//creo la tabla con el nombre docente
@Table(name = "tutores")
public class Tutor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    @Column(nullable = false)
    private int dni1;
    @NotEmpty
    @Column(nullable = false)
    private String nombreApellido1;
    @NotEmpty
    @Column(nullable = false)
    private int telefono1;
    private String parentesto1;

    @NotEmpty
    @Column(nullable = false)
    private int dni2;
    @NotEmpty
    @Column(nullable = false)
    private String nombreApellido2;
    @NotEmpty
    @Column(nullable = false)
    private int telefono2;
    private String parentesto2;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getDni1() {
        return dni1;
    }

    public void setDni1(int dni1) {
        this.dni1 = dni1;
    }

    public String getNombreApellido1() {
        return nombreApellido1;
    }

    public void setNombreApellido1(String nombreApellido1) {
        this.nombreApellido1 = nombreApellido1;
    }

    public int getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(int telefono1) {
        this.telefono1 = telefono1;
    }

    public String getParentesto1() {
        return parentesto1;
    }

    public void setParentesto1(String parentesto1) {
        this.parentesto1 = parentesto1;
    }

    public int getDni2() {
        return dni2;
    }

    public void setDni2(int dni2) {
        this.dni2 = dni2;
    }

    public String getNombreApellido2() {
        return nombreApellido2;
    }

    public void setNombreApellido2(String nombreApellido2) {
        this.nombreApellido2 = nombreApellido2;
    }

    public int getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(int telefono2) {
        this.telefono2 = telefono2;
    }

    public String getParentesto2() {
        return parentesto2;
    }

    public void setParentesto2(String parentesto2) {
        this.parentesto2 = parentesto2;
    }
}
