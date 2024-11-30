package com.corales_alex.aljobraAberturas.services.tornilloGomaService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corales_alex.aljobraAberturas.models.tornilloGoma.TornilloGoma;
import com.corales_alex.aljobraAberturas.repositorys.tornilloGomaRepository.ITornilloGomaRepository;

@Service
public class TornilloGomaService implements ITornilloGomaService{

    @Autowired
    private ITornilloGomaRepository iTornilloGomaRepository;

    @Override
    public Long createTornilloGoma(TornilloGoma tornilloGoma) {
        TornilloGoma tornilloGoma2 = iTornilloGomaRepository.save(tornilloGoma);
        return tornilloGoma2.getIdTornilloGoma();
    }

    @Override
    public List<TornilloGoma> getAllTornillosGomas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllTornillosGomas'");
    }

    @Override
    public void updateTornilloGoma() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateTornilloGoma'");
    }

    @Override
    public void deleteTornilloGoma() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteTornilloGoma'");
    }
    
}
