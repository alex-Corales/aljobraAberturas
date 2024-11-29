package com.corales_alex.aljobraAberturas.models.herrero;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
public class PrecioAluminio {
    @Id 
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long idPrecioAluminio;
    private double precioBlanco;
    private double precioNegro;
    private double precioAnodizado;
    private double precioNatural;
    @OneToOne
    @JoinColumn(name = "linea_herrero_id")
    @JsonIgnore
    private LineaHerrero lineaHerrero;

    public PrecioAluminio (double precioBlanco, double precioNegro, double precioAnodizado, double precioNatural, LineaHerrero lineaHerrero){
        this.precioBlanco = precioBlanco;
        this.precioNegro = precioNegro;
        this.precioAnodizado = precioAnodizado;
        this.precioNatural = precioNatural;
        this.lineaHerrero = lineaHerrero;
    }
}
