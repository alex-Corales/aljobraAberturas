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

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MargenDeGanancia {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long idMargenDeGanancia;
    private int blanco;
    private int negro;
    private int anodizado;
    private int natura;
    @OneToOne
    @JoinColumn(name = "linea_herrero_id")
    @JsonIgnore
    private LineaHerrero lineaHerrero;

    public MargenDeGanancia(int blanco, int negro, int anodizado, int natura, LineaHerrero lineaHerrero){
        this.blanco = blanco;
        this.negro = negro;
        this.anodizado = anodizado;
        this.natura = natura;
        this.lineaHerrero = lineaHerrero;
    }
}
