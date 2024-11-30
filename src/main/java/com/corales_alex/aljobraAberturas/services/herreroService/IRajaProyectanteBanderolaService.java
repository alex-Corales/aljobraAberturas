package com.corales_alex.aljobraAberturas.services.herreroService;

import java.util.List;

import com.corales_alex.aljobraAberturas.models.herrero.RajaProyectanteBanderola;

public interface IRajaProyectanteBanderolaService {
    public Long createRajaProyectanteBanderola(RajaProyectanteBanderola rajaProyectanteBanderola);
    public List<RajaProyectanteBanderola> getAllRajaProyectanteBanderola();
    public void updateRajaProyectanteBanderola();
    public void deleteRajaProyectanteBanderola();
}
