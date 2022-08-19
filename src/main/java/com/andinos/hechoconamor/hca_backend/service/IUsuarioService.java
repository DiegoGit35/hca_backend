package com.andinos.hechoconamor.hca_backend.service;

import com.andinos.hechoconamor.hca_backend.entity.Usuario;

public interface IUsuarioService {

    public Iterable<Usuario> findAll();

    public Usuario save(Usuario Usuario);

}
