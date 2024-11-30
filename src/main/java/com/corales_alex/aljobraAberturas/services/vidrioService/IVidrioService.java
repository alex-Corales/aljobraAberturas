package com.corales_alex.aljobraAberturas.services.vidrioService;

import java.util.List;

import com.corales_alex.aljobraAberturas.models.vidrio.Vidrio;

public interface IVidrioService {
    public Long createVidrio(Vidrio vidrio);
    public List<Vidrio> getAllVidrios();
    public void updateVidrio();
    public void deleteVidrio();
}
