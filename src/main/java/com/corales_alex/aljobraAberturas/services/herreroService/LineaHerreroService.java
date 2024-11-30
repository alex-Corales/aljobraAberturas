package com.corales_alex.aljobraAberturas.services.herreroService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corales_alex.aljobraAberturas.models.herrero.LineaHerrero;
import com.corales_alex.aljobraAberturas.repositorys.herreroRepository.ILineaHerreroRepository;

@Service
public class LineaHerreroService implements ILineaHerreroService{

    @Autowired
    private ILineaHerreroRepository iLineaHerreroRepository;

    @Override
    public Long createLineaHerrero(LineaHerrero lineaHerrero) {
        LineaHerrero lineaHerrero2 = iLineaHerreroRepository.save(lineaHerrero);
        return lineaHerrero2.getIdLineaHerrero();
    }

    @Override
    public List<LineaHerrero> getAllLineaHerreros() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllLineaHerreros'");
    }

    @Override
    public void updateLineaHerrero() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateLineaHerrero'");
    }

    @Override
    public void deleteLineaHerrero() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteLineaHerrero'");
    }
    
}
