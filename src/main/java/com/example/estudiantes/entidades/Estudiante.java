package com.example.estudiantes.entidades;

import jakarta.persistence.*;

@Entity
@Table(name="estudiantes")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="nombre",nullable = false,length = 50)
    private String nombre;

    @Column(name="edad",nullable = false)
    private Integer edad;

    @Column(name="genero")
    private Boolean genero;

    @OneToOne(mappedBy = "estudiante", cascade = CascadeType.ALL)
    private Acudiente acuediente;


    public Estudiante() {
    }

    public Estudiante(Integer id, String nombre, Integer edad, Boolean genero, Acudiente acuediente) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.acuediente = acuediente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Boolean getGenero() {
        return genero;
    }

    public void setGenero(Boolean genero) {
        this.genero = genero;
    }

    public Acudiente getAcuediente() {
        return acuediente;
    }

    public void setAcuediente(Acudiente acuediente) {
        this.acuediente = acuediente;
    }
}
