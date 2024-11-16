package com.corales_alex.aljobraAberturas.models;

import jakarta.annotation.Generated;
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
    private Double anchoArriba;
    private Double anchoAbajo;
    private Double alto;
    private String direccion;
    private String numeroTelefono;
    private String ubicacionDucha;

    public MamparaModel(){}

    public MamparaModel(Long idMampara, Double anchoArriba, Double anchoAbajo, Double alto, String direccion, String numeroTelefono, String ubicacionDucha){
        this.idMampara = idMampara;
        this.anchoArriba = anchoArriba;
        this.anchoAbajo = anchoAbajo;
        this.alto = alto;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
        this.ubicacionDucha = ubicacionDucha;
    }
}
