package com.andinos.hechoconamor.hca_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andinos.hechoconamor.hca_backend.entity.Producto;

import java.util.Set;

public interface ProductoDAO extends JpaRepository<Producto, Integer>{
    Set<Producto> findByNombre(String parteNombre);

}
