package com.corales_alex.aljobraAberturas.models.herrero;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
    @ManyToOne
    @JoinColumn(name = "linea_herrero_id") // Define la columna de unión en la tabla de HerreroCorrediza
    @JsonIgnore
    private LineaHerrero lineaHerrero;

    public HerreroCorrediza(String codigo, String detalle, int cantidad, double precioUnitario, double precio){
        this.codigo = codigo;
        this.detalle = detalle;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.precio = precio;
    }
}
