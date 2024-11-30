package com.corales_alex.aljobraAberturas.services.herreroService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corales_alex.aljobraAberturas.models.herrero.RajaProyectanteBanderola;
import com.corales_alex.aljobraAberturas.repositorys.herreroRepository.IRajaProyectanteBanderolaRepository;

@Service
public class RajaProyectanteBanderolaService implements IRajaProyectanteBanderolaService{

    @Autowired
    private IRajaProyectanteBanderolaRepository iRajaProyectanteBanderolaRepository;

    @Override
    public Long createRajaProyectanteBanderola(RajaProyectanteBanderola rajaProyectanteBanderola) {
        RajaProyectanteBanderola rajaProyectanteBanderola2 = iRajaProyectanteBanderolaRepository.save(rajaProyectanteBanderola);
        return rajaProyectanteBanderola2.getIdRajaProyectanteBanderola();
    }

    @Override
    public List<RajaProyectanteBanderola> getAllRajaProyectanteBanderola() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllRajaProyectanteBanderola'");
    }

    @Override
    public void updateRajaProyectanteBanderola() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateRajaProyectanteBanderola'");
    }

    @Override
    public void deleteRajaProyectanteBanderola() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteRajaProyectanteBanderola'");
    }
    
}
