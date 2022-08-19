package com.andinos.hechoconamor.hca_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andinos.hechoconamor.hca_backend.entity.Producto;
import com.andinos.hechoconamor.hca_backend.service.IProductoService;

@RestController
@RequestMapping("/")
public class ProductoController {
    @Autowired
    private IProductoService productoService;

    @GetMapping
    public List<Producto> getProductos(){
        return productoService.getProductos();
    }

    @PostMapping
    public ResponseEntity<Producto> save(@RequestBody Producto producto){
        return new ResponseEntity<> (productoService.save(producto), HttpStatus.FOUND);
    } 

}