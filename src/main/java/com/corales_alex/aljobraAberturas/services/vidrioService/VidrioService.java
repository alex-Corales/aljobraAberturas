package com.corales_alex.aljobraAberturas.services.vidrioService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corales_alex.aljobraAberturas.models.vidrio.Vidrio;
import com.corales_alex.aljobraAberturas.repositorys.vidrioRepository.IVidrioRepository;

@Service
public class VidrioService implements IVidrioService{

    @Autowired
    private IVidrioRepository iVidrioRepository;

    @Override
    public Long createVidrio(Vidrio vidrio) {
        Vidrio vidrio2 = iVidrioRepository.save(vidrio);
        return vidrio2.getIdVidrio();
    }

    @Override
    public List<Vidrio> getAllVidrios() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllVidrios'");
    }

    @Override
    public void updateVidrio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateVidrio'");
    }

    @Override
    public void deleteVidrio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteVidrio'");
    }
    
}
    