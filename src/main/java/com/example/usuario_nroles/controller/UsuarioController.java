package com.example.usuario_nroles.controller;

import com.example.usuario_nroles.models.Usuario;
import com.example.usuario_nroles.service.IUsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final IUsuarioService usuarioService;

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<Usuario>> findAllUsuarios(){
        return new ResponseEntity<>(usuarioService.findAllUsuarios(), HttpStatus.OK);
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Usuario> crearUsuario(@RequestBody Usuario usuario){
        return new ResponseEntity<>(usuarioService.createUsuario(usuario), HttpStatus.CREATED);
    }
}
