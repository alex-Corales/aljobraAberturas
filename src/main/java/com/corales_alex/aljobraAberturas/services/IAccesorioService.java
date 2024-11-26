package com.corales_alex.aljobraAberturas.services;

import java.util.List;

import com.corales_alex.aljobraAberturas.models.Accesorio;

public interface IAccesorioService {
    public void crearAccesorio();
    public Accesorio getAllAccesorio(Long id);
    public void updateAccesorio(Long id, Accesorio accesorios);
}