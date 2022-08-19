package com.andinos.hechoconamor.hca_backend.service;

import com.andinos.hechoconamor.hca_backend.entity.Producto;

import java.util.List;
import java.util.Set;

public interface IProductoService {

    public List<Producto> findAll();
    public Set<Producto> buscarPorNombre(String parteNombre);

    public Producto save(Producto producto);
}
