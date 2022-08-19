package com.andinos.hechoconamor.hca_backend.service;

import com.andinos.hechoconamor.hca_backend.entity.Usuario;
import com.andinos.hechoconamor.hca_backend.repository.UsuarioDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class UsuarioServiceImpl implements IUsuarioService{

    @Autowired
    private UsuarioDAO usuarioDao;
    @Override
    @Transactional(readOnly = true)
    public Iterable<Usuario> findAll() {
        return usuarioDao.findAll();
    }

    @Override
    public Usuario save(Usuario usuario) {
        usuarioDao.save(usuario);
        return usuario;
    }
}
