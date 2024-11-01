package com.example.practica.model.repository;

import com.example.practica.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepository  extends JpaRepository<Producto, Long> {
}
