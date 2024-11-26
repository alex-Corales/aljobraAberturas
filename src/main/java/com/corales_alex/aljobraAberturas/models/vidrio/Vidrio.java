package com.corales_alex.aljobraAberturas.models.vidrio;

import org.hibernate.annotations.ManyToAny;

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
public class Vidrio {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long idVidrio;
    private String nombreVidrio;
    private double preciovidrioM2;
    private double ventaVidrioM2;
    private double corteVidrioM2;
    @ManyToOne
    @JoinColumn(name = "accesorio_id")
    @JsonIgnore
    private Accesorio accesorio;

    public Vidrio(String nombreVidrio, double preciovidrioM2, double ventaVidrioM2, double corteVidrioM2, Accesorio accesorio) {
        this.nombreVidrio = nombreVidrio;
        this.preciovidrioM2 = preciovidrioM2;
        this.ventaVidrioM2 = ventaVidrioM2;
        this.corteVidrioM2 = corteVidrioM2;
        this.accesorio = accesorio;
    }
    
}
