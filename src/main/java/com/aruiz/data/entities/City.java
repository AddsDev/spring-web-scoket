package com.aruiz.data.entities;

import jakarta.persistence.*;

@Entity @Table(name = "ciudades")
public class City {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ciud_id")
    private Integer id;

    @Column(name = "ciud_nombre", nullable = false, unique = true)
    private String nombre;

    // getters/setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}
