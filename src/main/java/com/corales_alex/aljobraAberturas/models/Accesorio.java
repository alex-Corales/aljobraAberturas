package com.corales_alex.aljobraAberturas.models;

import java.util.List;

import com.corales_alex.aljobraAberturas.models.herrero.LineaHerrero;
import com.corales_alex.aljobraAberturas.models.tornilloGoma.TornilloGoma;
import com.corales_alex.aljobraAberturas.models.vidrio.Vidrio;

import jakarta.persistence.CascadeType;
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
public class Accesorio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idAccesorio;
    @OneToOne
    private LineaHerrero lineaHerrero;
    @OneToMany(mappedBy = "accesorio", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Vidrio> vidrio;
    @OneToMany(mappedBy = "accesorio", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TornilloGoma> tornilloGoma;
}
