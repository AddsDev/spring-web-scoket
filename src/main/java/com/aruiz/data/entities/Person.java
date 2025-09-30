package com.aruiz.data.entities;


import jakarta.persistence.*;

@Entity @Table(name = "personas")
public class Person {
    @Id
    @Column(name = "dir_tel", length = 20)
    private String telefono;

    @Column(name = "dir_tipo_tel", length = 20, nullable = false)
    private String tipoTel;

    @Column(name = "dir_nombre", length = 100, nullable = false)
    private String nombre;

    @Column(name = "dir_direccion", length = 150, nullable = false)
    private String direccion;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "dir_ciud_id", nullable = false)
    private City ciudad;

    // getters/setters
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public String getTipoTel() { return tipoTel; }
    public void setTipoTel(String tipoTel) { this.tipoTel = tipoTel; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public City getCiudad() { return ciudad; }
    public void setCiudad(City ciudad) { this.ciudad = ciudad; }
}