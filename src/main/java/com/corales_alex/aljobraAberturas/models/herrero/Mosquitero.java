package com.corales_alex.aljobraAberturas.models.herrero;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Mosquitero {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long idMosquitero;
    private String codigo;
    private String detalle;
    private int cantidad;
    private double precioUnitario;
    private double precio;
}
