package com.andinos.hechoconamor.hca_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andinos.hechoconamor.hca_backend.entity.Producto;
import com.andinos.hechoconamor.hca_backend.repository.ProductoDAO;

@Service
public class ProductoServiceImpl implements IProductoService{

    @Autowired
    private ProductoDAO productoDAO;

    public List<Producto> getProductos(){
        return productoDAO.findAll();
    }
    public Producto save(Producto producto){
        return productoDAO.save(producto);
    }
}
