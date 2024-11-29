package com.corales_alex.aljobraAberturas.models.herrero;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
import lombok.ToString;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class PuertaDeRabatir {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long idPuertaDeRabatir;
    private String codigo;
    private String detalle;
    private int cantidad;
    private double precioUnitario;
    private double precio;
    @ManyToOne
    @JoinColumn(name = "linea_herrero_id")
    @JsonIgnore
    private LineaHerrero lineaHerrero;

    public PuertaDeRabatir(String codigo, String detalle, int cantidad, double precioUnitario, double precio, LineaHerrero lineaHerrero){
        this.codigo = codigo;
        this.detalle = detalle;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.precio = precio;
        this.lineaHerrero = lineaHerrero;
    }
}
