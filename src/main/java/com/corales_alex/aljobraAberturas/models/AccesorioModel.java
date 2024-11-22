package com.corales_alex.aljobraAberturas.models;

import com.corales_alex.aljobraAberturas.models.herrero.LineaHerrero;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AccesorioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idAccesorio;
    @OneToOne
    private LineaHerrero lineaHerrero;
}
