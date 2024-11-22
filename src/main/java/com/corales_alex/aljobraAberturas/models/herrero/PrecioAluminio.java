package com.corales_alex.aljobraAberturas.models.herrero;

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
public class PrecioAluminio {
    @Id 
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long idPrecioAluminio;
    private double precioBlanco;
    private double precioNegro;
    private double precioAnodizado;
    private double precioNatural;
}
