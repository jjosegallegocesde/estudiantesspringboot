package com.example.estudiantes.entidades;

import jakarta.persistence.*;

@Entity
@Table(name="cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="nombre")
    private String nombre;

    @ManyToOne
    @JoinColumn(name="profesor_id")
    private Profesor profesor;


    public Curso() {
    }

    public Curso(Integer id, String nombre, Profesor profesor) {
        this.id = id;
        this.nombre = nombre;
        this.profesor = profesor;
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

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}
