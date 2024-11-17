package com.corales_alex.aljobraAberturas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corales_alex.aljobraAberturas.models.MamparaModel;
import com.corales_alex.aljobraAberturas.repositorys.IMamparaRepository;

@Service
public class MamparaService implements IMamparaService{

    @Autowired
    private IMamparaRepository iMamparaRepository;

    @Override
    public void saveMampara(MamparaModel mampara) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveMampara'");
    }

    @Override
    public List<MamparaModel> getAllMamparas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllMamparas'");
    }

    @Override
    public MamparaModel getMampara() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMampara'");
    }

    @Override
    public void deteleMampara(Long idMampara) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deteleMampara'");
    }

    @Override
    public void updateMampara(Long idMampara, MamparaModel mamparaNueva) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateMampara'");
    }
    
}
