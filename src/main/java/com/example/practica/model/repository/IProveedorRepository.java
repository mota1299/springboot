package com.example.practica.model.repository;

import com.example.practica.model.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProveedorRepository  extends JpaRepository<Proveedor, Long> {
}
