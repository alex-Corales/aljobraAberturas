package com.corales_alex.aljobraAberturas.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class MamparaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idMampara;
    private double anchoArriba;
    private double anchoAbajo;
    private double alto;
    private String direccion;
    private String numeroTelefono;
    private String ubicacionDucha;
    private double corteAltoPañoFijo;
    private double corteAltoPañoCorredizo;
    private double corteAnchoPaños;

    public MamparaModel(){}

    public MamparaModel(Long idMampara, double anchoArriba, double anchoAbajo, double alto, String direccion, 
                        String numeroTelefono, String ubicacionDucha, double corteAltoPañoFijo, double corteAltoPañoCorredizo,
                        double corteAnchoPaños){
        this.idMampara = idMampara;
        this.anchoArriba = anchoArriba;
        this.anchoAbajo = anchoAbajo;
        this.alto = alto;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
        this.ubicacionDucha = ubicacionDucha;
        this.corteAltoPañoFijo = corteAltoPañoFijo;
        this.corteAltoPañoCorredizo = corteAltoPañoCorredizo;
        this.corteAnchoPaños = corteAnchoPaños;
    }
}
