package com.finanzasgo.repository;

import com.finanzasgo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Esta clase ayuda a manejar los datos de los usuarios.
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
        // Aquí podemos agregar métodos personalizados si los necesitamos
    }