package com.franciscoSepulveda.ProyectoFinal.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "facturas")
public class FacturaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="clientes_id")
    private ClienteModel cliente;

    @Column(name = "fecha")
    private Date fechaCreacion;

    private Double total;

}
