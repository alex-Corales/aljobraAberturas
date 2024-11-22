package com.corales_alex.aljobraAberturas.services;

import java.util.List;

import com.corales_alex.aljobraAberturas.models.AccesorioModel;

public interface IAccesorioService {
    public void crearAccesorio();
    public List<AccesorioModel> getAllAccesorio(Long id);
    public void updateAccesorio(Long id, AccesorioModel accesorios);
}