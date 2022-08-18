package com.andinos.hechoconamor.hca_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andinos.hechoconamor.hca_backend.entity.Usuario;

public interface UsuarioDAO extends JpaRepository<Usuario, Integer>{
    
}
