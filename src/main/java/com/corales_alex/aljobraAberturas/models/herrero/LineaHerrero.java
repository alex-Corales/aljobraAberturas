package com.corales_alex.aljobraAberturas.models.herrero;

import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class LineaHerrero {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long idLineaHerrero;
    @OneToMany(mappedBy = "lineaHerrero")
    private List<HerreroCorrediza> herreroCorrediza;
    /*@OneToMany
    private List<RajaProyectanteBanderola> rajaProyectanteBanderola;
    @OneToMany
    private List<Mosquitero> mosquitero;
    @OneToMany
    private List<PuertaDeRabatir> puertaDeRabatir;
    @OneToMany
    private List<PrecioAluminio> precioAluminio;
    @OneToMany
    private List<MargenDeGanancia> margenDeGanancia;*/

}
