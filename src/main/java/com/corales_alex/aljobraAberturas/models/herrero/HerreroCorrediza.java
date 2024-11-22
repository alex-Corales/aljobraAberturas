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
public class HerreroCorrediza {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long idHerreroCorrediza;
    private String codigo;
    private String detalle;
    private int cantidad;
    private double precioUnitario;
    private double precio;

    public HerreroCorrediza(String codigo, String detalle, int cantidad, double precioUnitario, double precio){
        this.codigo = codigo;
        this.detalle = detalle;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.precio = precio;
    }
}
