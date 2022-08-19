package com.andinos.hechoconamor.hca_backend.entity;

import java.util.Date;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer idProducto;

    @Column(name="nombre")
    private String nombre;
    @Column(name="shortDescription")
    private String shortDescription;
    @Column(name="fullDescription")
    private String fullDescription;
    @Column(name="imagen")
    private String imagen;
    
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Column(name = "create_time")
    private Date fechaYhora;

    @Column(name="porcentajeDescuento")
    private Integer PorcentajeDescuento;
    @Column(name="largo")
    private Float largo;
    @Column(name="ancho")
    private Float ancho;
    @Column(name="peso")
    private Float peso;

    @OneToOne
    private Venta venta;

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Date getFechaYhora() {
        return fechaYhora;
    }

    public void setFechaYhora(Date fechaYhora) {
        this.fechaYhora = fechaYhora;
    }

    public Integer getPorcentajeDescuento() {
        return PorcentajeDescuento;
    }

    public void setPorcentajeDescuento(Integer porcentajeDescuento) {
        PorcentajeDescuento = porcentajeDescuento;
    }

    public Float getLargo() {
        return largo;
    }

    public void setLargo(Float largo) {
        this.largo = largo;
    }

    public Float getAncho() {
        return ancho;
    }

    public void setAncho(Float ancho) {
        this.ancho = ancho;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    @Override
    public String toString() {
        return "Producto [PorcentajeDescuento=" + PorcentajeDescuento + ", ancho=" + ancho + ", fechaYhora="
                + fechaYhora + ", fullDescription=" + fullDescription + ", idProducto=" + idProducto + ", imagen="
                + imagen + ", largo=" + largo + ", nombre=" + nombre + ", peso=" + peso + ", shortDescription="
                + shortDescription + ", venta=" + venta + "]";
    }


}
