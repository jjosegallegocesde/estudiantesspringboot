package com.example.estudiantes.entidades;

import jakarta.persistence.*;

@Entity
@Table(name="matriculas")
public class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name="estudiante_id")
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name="curso_id")
    private Curso curso;

    public Matricula() {
    }

    public Matricula(Integer id, Estudiante estudiante, Curso curso) {
        this.id = id;
        this.estudiante = estudiante;
        this.curso = curso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
