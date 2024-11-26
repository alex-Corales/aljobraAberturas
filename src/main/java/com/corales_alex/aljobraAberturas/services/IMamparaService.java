package com.corales_alex.aljobraAberturas.services;

import java.util.List;

import com.corales_alex.aljobraAberturas.models.Mampara;

public interface IMamparaService {
    public void saveMampara(Mampara mampara);
    public List<Mampara> getAllMamparas();
    public Mampara getMampara(Long idMampara);
    public void deteleMampara(Long idMampara);
    public void updateMampara(Long idMampara, Mampara mamparaNueva);
}
