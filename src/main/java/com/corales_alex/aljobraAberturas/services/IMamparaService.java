package com.corales_alex.aljobraAberturas.services;

import java.util.List;

import com.corales_alex.aljobraAberturas.models.MamparaModel;

public interface IMamparaService {
    public void saveMampara(MamparaModel mampara);
    public List<MamparaModel> getAllMamparas();
    public MamparaModel getMampara();
    public void deteleMampara(Long idMampara);
    public void updateMampara(Long idMampara, MamparaModel mamparaNueva);
}
