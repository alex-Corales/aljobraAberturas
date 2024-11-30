package com.corales_alex.aljobraAberturas.services.herreroService;

import java.util.List;

import com.corales_alex.aljobraAberturas.models.herrero.PrecioAluminio;

public interface IPrecioAluminioService {
    public Long createPrecioAluminio(PrecioAluminio precioAluminio);
    public List<PrecioAluminio> getAllPrecioAluminios();
    public void updatePrecioAluminio();
    public void deletePrecioAluminio();
}
