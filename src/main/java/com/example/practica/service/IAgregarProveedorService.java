package com.example.practica.service;

import com.example.practica.model.Proveedor;
import com.example.practica.model.response.OperacionExitosaResponse;

public interface IAgregarProveedorService {

    OperacionExitosaResponse agregarProveedor(Proveedor proveedor);
}
