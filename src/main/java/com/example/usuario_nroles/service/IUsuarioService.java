package com.example.usuario_nroles.service;

import com.example.usuario_nroles.models.Usuario;

import java.util.List;

public interface IUsuarioService {
    List<Usuario> findAllUsuarios();
    Usuario createUsuario(Usuario usuario);
}
