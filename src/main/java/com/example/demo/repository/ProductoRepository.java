package com.example.demo.repository;

import com.example.demo.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio para operaciones de base de datos sobre Producto
 * Extiende JpaRepository que proporciona métodos CRUD automáticamente
 * @author NOVA 348
 */
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

    // Spring Data JPA genera automáticamente la implementación
    // Métodos disponibles: save(), findAll(), findById(), delete(), etc.

}