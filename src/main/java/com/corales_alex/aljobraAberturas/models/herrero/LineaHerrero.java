package com.corales_alex.aljobraAberturas.models.herrero;

import java.util.List;

import com.corales_alex.aljobraAberturas.models.Accesorio;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    @JsonManagedReference
    private List<HerreroCorrediza> herreroCorrediza;
    @OneToMany(mappedBy = "lineaHerrero")
    private List<RajaProyectanteBanderola> rajaProyectanteBanderola;
    @OneToMany(mappedBy = "lineaHerrero")
    private List<Mosquitero> mosquitero;
    @OneToMany(mappedBy = "lineaHerrero")
    private List<PuertaDeRabatir> puertaDeRabatir;
    @OneToOne(mappedBy = "lineaHerrero")
    private PrecioAluminio precioAluminio;
    @OneToOne(mappedBy = "lineaHerrero")
    private MargenDeGanancia margenDeGanancia;

}
 