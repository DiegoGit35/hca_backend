package com.andinos.hechoconamor.hca_backend.controller;

import com.andinos.hechoconamor.hca_backend.entity.Producto;
import com.andinos.hechoconamor.hca_backend.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    private IProductoService productoService;

    @GetMapping
    public ResponseEntity<?> getProductos() {
        return new ResponseEntity<>(productoService.findAll(),
                HttpStatus.FOUND);
    }

    @RequestMapping(value = "busqueda/{busqueda}", method = RequestMethod.GET)
    public ResponseEntity<?> getProductoPorNombre(@PathVariable(value = "busqueda") String busqueda) {
        return new ResponseEntity<>(productoService.buscarPorNombre(busqueda), HttpStatus.FOUND);
    }

    @PostMapping
    public ResponseEntity<Producto> save(@RequestBody Producto producto) {
        return new ResponseEntity<>(productoService.save(producto), HttpStatus.ACCEPTED);
    }
}
