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
        Double calculoAltoPañoFijo = mampara.getAlto()-7.2;
        Double calculoAltoPañoCorredizo = calculoAltoPañoFijo + 1.5;
        Double calculoAnchoPaños = 0.0;

        if(mampara.getAnchoAbajo() > mampara.getAnchoArriba()) 
            calculoAnchoPaños = ((mampara.getAnchoAbajo() - 0.6) + 2) / 2; 
        
        if(mampara.getAnchoAbajo() < mampara.getAnchoArriba()) 
            calculoAnchoPaños = ((mampara.getAnchoArriba() - 0.6) + 2) / 2;
            
        mampara.setCorteAltoPañoFijo(calculoAltoPañoFijo);
        mampara.setCorteAltoPañoCorredizo(calculoAltoPañoCorredizo);
        mampara.setCorteAnchoPaños(calculoAnchoPaños);

        iMamparaRepository.save(mampara);
    }

    @Override
    public List<MamparaModel> getAllMamparas() {
        return iMamparaRepository.findAll();
    }

    @Override
    public MamparaModel getMampara(Long idMampara) {
        return iMamparaRepository.findById(idMampara).orElse(null);
    }

    @Override
    public void deteleMampara(Long idMampara) {
        iMamparaRepository.deleteById(idMampara);
    }

    @Override
    public void updateMampara(Long idMampara, MamparaModel mamparaNueva) {
        MamparaModel mamparaAux = this.getMampara(idMampara);
        mamparaAux.setAnchoArriba(mamparaNueva.getAnchoArriba());
        mamparaAux.setAnchoAbajo(mamparaNueva.getAnchoAbajo());
        mamparaAux.setAlto(mamparaNueva.getAlto());
        mamparaAux.setDireccion(mamparaNueva.getDireccion());
        mamparaAux.setNumeroTelefono(mamparaNueva.getNumeroTelefono());
        mamparaAux.setUbicacionDucha(mamparaNueva.getUbicacionDucha());
        this.saveMampara(mamparaAux);
    }
    
}
