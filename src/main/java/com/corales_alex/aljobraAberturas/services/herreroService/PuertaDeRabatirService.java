package com.corales_alex.aljobraAberturas.services.herreroService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corales_alex.aljobraAberturas.models.herrero.PuertaDeRabatir;
import com.corales_alex.aljobraAberturas.repositorys.herreroRepository.IPuertaDeRabatirRepository;

@Service
public class PuertaDeRabatirService implements IPuertaDeRabatirService{

    @Autowired
    private IPuertaDeRabatirRepository iPuertaDeRabatirRepository;

    @Override
    public Long createPuertaDeRebatir(PuertaDeRabatir puertaDeRabatir) {
        PuertaDeRabatir puertaDeRabatir2 = iPuertaDeRabatirRepository.save(puertaDeRabatir);
        return puertaDeRabatir2.getIdPuertaDeRabatir();
    }

    @Override
    public List<PuertaDeRabatir> getAllPuertasDeRebatir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllPuertasDeRebatir'");
    }

    @Override
    public void updatePuertaDeRebatir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updatePuertaDeRebatir'");
    }

    @Override
    public void deletePuertaDeRebatir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletePuertaDeRebatir'");
    }
    
}
