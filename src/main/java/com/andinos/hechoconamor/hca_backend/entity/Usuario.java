package com.andinos.hechoconamor.hca_backend.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String email;
    private String telefono;
    private Date fechaNacimiento;
    @OneToMany
    @JoinColumn(name = "idVenta")
    private List<Venta> venta;

    public List<Venta> getVenta() {
        return venta;
    }
    public void setVenta(List<Venta> venta) {
        this.venta = venta;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    @Override
    public String toString() {
        return "Usuario [email=" + email + ", fechaNacimiento=" + fechaNacimiento + ", id=" + id + ", nombre=" + nombre
                + ", telefono=" + telefono + "]";
    }

    
}
