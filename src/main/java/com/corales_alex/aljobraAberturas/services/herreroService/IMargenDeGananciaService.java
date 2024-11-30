package com.corales_alex.aljobraAberturas.services.herreroService;

import java.util.List;

import com.corales_alex.aljobraAberturas.models.herrero.MargenDeGanancia;

public interface IMargenDeGananciaService {
    public Long createMargenDeGanancia(MargenDeGanancia margenDeGanancia);
    public List<MargenDeGanancia> getAllMargenDeGanancias();
    public void updateMargenDeGanancia();
    public void deleteMargenDeGanancia();
}
