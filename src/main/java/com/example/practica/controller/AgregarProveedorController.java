package com.example.practica.controller;

import com.example.practica.exception.GeneralException;
import com.example.practica.model.Proveedor;
import com.example.practica.model.response.OperacionExitosaResponse;
import com.example.practica.service.IAgregarProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class AgregarProveedorController implements IAgregarProveedorController{

    @Autowired
    private IAgregarProveedorService iAgregarProveedorService;

    @Override
    public ResponseEntity<OperacionExitosaResponse> agregarProveedor(Proveedor proveedor) {
        OperacionExitosaResponse response = null;
             response = iAgregarProveedorService.agregarProveedor(proveedor);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
