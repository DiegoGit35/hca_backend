package com.andinos.hechoconamor.hca_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andinos.hechoconamor.hca_backend.entity.Venta;

public interface VentaDAO extends JpaRepository<Venta, Integer>{
    
}
