package com.corales_alex.aljobraAberturas.services.tornilloGomaService;

import java.util.List;

import com.corales_alex.aljobraAberturas.models.tornilloGoma.TornilloGoma;

public interface ITornilloGomaService {
    public Long createTornilloGoma(TornilloGoma tornilloGoma);
    public List<TornilloGoma> getAllTornillosGomas();
    public void updateTornilloGoma();
    public void deleteTornilloGoma();    
}
