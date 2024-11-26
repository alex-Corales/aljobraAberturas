package com.corales_alex.aljobraAberturas.models.tornilloGoma;

import com.corales_alex.aljobraAberturas.models.Accesorio;
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

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TornilloGoma {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long idTornilloGoma;
    private String nombreTornilloGoma;
    private int cantidad;
    private double precioUnitario;
    private double precio;
    @ManyToOne
    @JoinColumn(name = "accesorio_id")
    @JsonIgnore
    private Accesorio accesorio;
    
    public TornilloGoma(String nombreTornilloGoma, int cantidad, double precioUnitario, double precio, Accesorio accesorio){
        this.nombreTornilloGoma = nombreTornilloGoma;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.precio = precio;
        this.accesorio = accesorio;
    }
}
