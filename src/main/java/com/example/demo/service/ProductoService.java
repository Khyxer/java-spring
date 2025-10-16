package com.example.demo.service;

import com.example.demo.model.Producto;
import com.example.demo.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Servicio que contiene la lógica de negocio para Productos
 * Actúa como intermediario entre el Controller y el Repository
 * @author NOVA 348
 */
@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    // Inyección de dependencias por constructor
    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    /**
     * Obtiene todos los productos
     * @return Lista de productos
     */
    public List<Producto> obtenerTodos() {
        return productoRepository.findAll();
    }

    /**
     * Obtiene un producto por su ID
     * @param id Identificador del producto
     * @return Producto encontrado o null
     */
    public Optional<Producto> obtenerPorId(Long id) {
        return productoRepository.findById(id);
    }

    /**
     * Guarda un nuevo producto o actualiza uno existente
     * @param producto Producto a guardar
     * @return Producto guardado con ID generado
     */
    public Producto guardar(Producto producto) {
        return productoRepository.save(producto);
    }

    /**
     * Elimina un producto por su ID
     * @param id Identificador del producto a eliminar
     */
    public void eliminar(Long id) {
        productoRepository.deleteById(id);
    }
}