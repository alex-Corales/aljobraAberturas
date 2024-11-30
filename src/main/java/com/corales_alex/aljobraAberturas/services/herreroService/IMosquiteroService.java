package com.corales_alex.aljobraAberturas.services.herreroService;

import java.util.List;

import com.corales_alex.aljobraAberturas.models.herrero.Mosquitero;

public interface IMosquiteroService {
    public Long createMosquitero(Mosquitero mosquitero);
    public List<Mosquitero> getAllMosquiteros();
    public void updateMosquitero();
    public void deleteMosquitero();
}
