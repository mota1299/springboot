package com.example.practica.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEC_ID_PRODUCTO")
    @SequenceGenerator(name = "SEC_ID_PRODUCTO", sequenceName = "SEC_ID_PRODUCTO", allocationSize = 1)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "caducidad", nullable = false)
    private Date caducidad;

    @ManyToOne // Cambiar a ManyToOne para la relación correcta
    @JoinColumn(name = "fk_id_proveedor", referencedColumnName = "id_proveedor")
    private Proveedor proveedor;

}
