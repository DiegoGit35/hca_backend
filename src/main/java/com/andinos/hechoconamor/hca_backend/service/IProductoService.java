package com.andinos.hechoconamor.hca_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.andinos.hechoconamor.hca_backend.entity.Producto;

@Service
public interface IProductoService {
    public Producto save(Producto producto);
    public List<Producto> getProductos();
    
}
