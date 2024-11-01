package com.example.practica.controller;

import com.example.practica.model.Proveedor;
import com.example.practica.model.response.OperacionExitosaResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface IAgregarProveedorController {

    @PostMapping("agregar/proveedor")
    ResponseEntity<OperacionExitosaResponse> agregarProveedor(@RequestBody Proveedor proveedor);

}
