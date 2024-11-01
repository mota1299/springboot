package com.example.practica.service;

import com.example.practica.exception.GeneralException;
import com.example.practica.model.Proveedor;
import com.example.practica.model.repository.IProveedorRepository;
import com.example.practica.model.response.OperacionExitosaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import static com.example.practica.utils.Mensajes.ERROR_OPERACION;
import static com.example.practica.utils.Mensajes.OPERACION_EXITOSA;


@Service
public class AgregarProveedorService implements IAgregarProveedorService{

    @Autowired
    private IProveedorRepository iProveedorRepository;

    @Override
    public OperacionExitosaResponse agregarProveedor(Proveedor proveedor) {
        OperacionExitosaResponse response = OperacionExitosaResponse.builder().mensaje(OPERACION_EXITOSA).build();
        try {
            iProveedorRepository.save(proveedor);
        }catch (DataAccessException e){
            throw new GeneralException(ERROR_OPERACION);
        }
        return response;
    }
}
