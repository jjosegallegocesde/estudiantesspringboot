package com.example.estudiantes.entidades;

import jakarta.persistence.*;

@Entity
@Table(name="acudientes")
public class Acudiente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="nombres")
    private String nombre;

    @Column(name="parentesco")
    private String parentesco;

    @Column(name="telefono")
    private String telefono;

    @OneToOne
    @JoinColumn(name="estudiante_id")
    private Estudiante estudiante;

    public Acudiente() {
    }

    public Acudiente(Integer id, String nombre, String parentesco, String telefono, Estudiante estudiante) {
        this.id = id;
        this.nombre = nombre;
        this.parentesco = parentesco;
        this.telefono = telefono;
        this.estudiante = estudiante;
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

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
