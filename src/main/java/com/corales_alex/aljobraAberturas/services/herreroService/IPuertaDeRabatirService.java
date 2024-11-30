package com.corales_alex.aljobraAberturas.services.herreroService;

import java.util.List;

import com.corales_alex.aljobraAberturas.models.herrero.PuertaDeRabatir;

public interface IPuertaDeRabatirService {
    public Long createPuertaDeRebatir(PuertaDeRabatir puertaDeRabatir);
    public List<PuertaDeRabatir> getAllPuertasDeRebatir();
    public void updatePuertaDeRebatir();
    public void deletePuertaDeRebatir();
}
