package com.finanzasgo.service;

import com.finanzasgo.model.Usuario;
import com.finanzasgo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Clase que maneja la lógica del negocio para los usuarios
@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // Método para registrar a un usuario
    public Usuario registrarUsuario(Usuario usuario) {
        if (usuario == null) {
            throw new IllegalArgumentException("El usuario no puede ser nulo");
        }
        return usuarioRepository.save(usuario);
    }

    // Método para manejar excepciones
    public void handleException(Exception e) {
        // Lógica para manejar excepciones
        System.out.println("Error: " + e.getMessage());
    }
}