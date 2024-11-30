package com.corales_alex.aljobraAberturas.services.herreroService;

import java.util.List;
import com.corales_alex.aljobraAberturas.models.herrero.LineaHerrero;

public interface ILineaHerreroService {
    public Long createLineaHerrero(LineaHerrero lineaHerrero);
    public List<LineaHerrero> getAllLineaHerreros();
    public void updateLineaHerrero();
    public void deleteLineaHerrero();
}
