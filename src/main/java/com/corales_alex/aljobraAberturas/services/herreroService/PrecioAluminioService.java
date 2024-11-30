package com.corales_alex.aljobraAberturas.services.herreroService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corales_alex.aljobraAberturas.models.herrero.PrecioAluminio;
import com.corales_alex.aljobraAberturas.repositorys.herreroRepository.IPrecioAluminioRepository;

@Service
public class PrecioAluminioService implements IPrecioAluminioService{

    @Autowired
    private IPrecioAluminioRepository iPrecioAluminioRepository;

    @Override
    public Long createPrecioAluminio(PrecioAluminio precioAluminio) {
        PrecioAluminio precioAluminio2 = iPrecioAluminioRepository.save(precioAluminio);
        return precioAluminio2.getIdPrecioAluminio();
    }

    @Override
    public List<PrecioAluminio> getAllPrecioAluminios() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllPrecioAluminios'");
    }

    @Override
    public void updatePrecioAluminio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updatePrecioAluminio'");
    }

    @Override
    public void deletePrecioAluminio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletePrecioAluminio'");
    }
}
