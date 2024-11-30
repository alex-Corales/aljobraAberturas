package com.corales_alex.aljobraAberturas.services.herreroService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corales_alex.aljobraAberturas.models.herrero.HerreroCorrediza;
import com.corales_alex.aljobraAberturas.repositorys.herreroRepository.IHerreroCorrizaRepository;

@Service
public class HerreroCorredizaService implements IHerreroCorredizaService{

    @Autowired
    private IHerreroCorrizaRepository iHerreroCorrizaRepository;

    @Override
    public HerreroCorrediza createHerreroCorrediza(HerreroCorrediza herreroCorrediza) {
        HerreroCorrediza herreroCorrediza2 = iHerreroCorrizaRepository.save(herreroCorrediza);
        return herreroCorrediza2;
    }

    @Override
    public List<HerreroCorrediza> getAllHerreroCorredizas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllHerreroCorredizas'");
    }

    @Override
    public void updateHerreroCorrediza() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateHerreroCorrediza'");
    }

    @Override
    public void deleteHerreroCorrediza() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteHerreroCorrediza'");
    }
    
}
