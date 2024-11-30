package com.corales_alex.aljobraAberturas.services.herreroService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corales_alex.aljobraAberturas.models.herrero.Mosquitero;
import com.corales_alex.aljobraAberturas.repositorys.herreroRepository.IMosquiteroRepository;

@Service
public class MosquiteroService implements IMosquiteroService{

    @Autowired
    private IMosquiteroRepository iMosquiteroRepository;

    @Override
    public Long createMosquitero(Mosquitero mosquitero) {
        Mosquitero mosquitero2 = iMosquiteroRepository.save(mosquitero);
        return mosquitero2.getIdMosquitero();
    }

    @Override
    public List<Mosquitero> getAllMosquiteros() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllMosquiteros'");
    }

    @Override
    public void updateMosquitero() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateMosquitero'");
    }

    @Override
    public void deleteMosquitero() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteMosquitero'");
    }
    
}
