package com.corales_alex.aljobraAberturas.services.herreroService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corales_alex.aljobraAberturas.models.herrero.MargenDeGanancia;
import com.corales_alex.aljobraAberturas.repositorys.herreroRepository.IMargenDeGananciaRepository;

@Service
public class MargenDeGananciaService implements IMargenDeGananciaService{

    @Autowired
    private IMargenDeGananciaRepository iMargenDeGananciaRepository;

    @Override
    public Long createMargenDeGanancia(MargenDeGanancia margenDeGanancia) {
        MargenDeGanancia margenDeGanancia2 = iMargenDeGananciaRepository.save(margenDeGanancia); 
        return margenDeGanancia2.getIdMargenDeGanancia();
    }

    @Override
    public List<MargenDeGanancia> getAllMargenDeGanancias() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllMargenDeGanancias'");
    }

    @Override
    public void updateMargenDeGanancia() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateMargenDeGanancia'");
    }

    @Override
    public void deleteMargenDeGanancia() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteMargenDeGanancia'");
    }
    
}
