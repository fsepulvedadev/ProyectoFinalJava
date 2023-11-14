package com.franciscoSepulveda.ProyectoFinal.model;

import jakarta.persistence.*;

@Entity
@Table(name = "detalles_factura")
public class DetallesFacturaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "factura_id", nullable = false)
    private FacturaModel factura;
    private Integer cantidad;
    @ManyToOne
    @JoinColumn(name = "productos_id", nullable = false)
    private ProductoModel producto;

    private Double importe;
}
