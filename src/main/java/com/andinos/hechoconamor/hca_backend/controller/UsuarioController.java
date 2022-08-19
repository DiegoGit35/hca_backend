package com.andinos.hechoconamor.hca_backend.controller;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.andinos.hechoconamor.hca_backend.entity.Usuario;
import com.andinos.hechoconamor.hca_backend.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/usuario")
public class UsuarioController implements Serializable {

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<?> getUsuarios(){
        return new ResponseEntity<> (usuarioService.findAll(),
                HttpStatus.ACCEPTED);
    }

    @PostMapping
    public ResponseEntity<Usuario> saveUsuario(@RequestBody Usuario usuario){
        return new ResponseEntity<> (usuarioService.save(usuario), HttpStatus.ACCEPTED);
    }
}
