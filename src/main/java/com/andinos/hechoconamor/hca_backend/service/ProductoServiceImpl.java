package com.andinos.hechoconamor.hca_backend.service;

import com.andinos.hechoconamor.hca_backend.entity.Producto;
import com.andinos.hechoconamor.hca_backend.repository.ProductoDAO;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

public class ProductoServiceImpl implements IProductoService{

    private ProductoDAO productoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> findAll() {
        return (List<Producto>) productoDao.findAll();
    }


    @Transactional
    public Set<Producto> buscarPorNombre(String parteNombre){
        return (Set<Producto>) productoDao.findByNombre(parteNombre);
    }

    @Override
    public Producto save(Producto producto) {
        productoDao.save(producto);
        return producto;
    }

}
