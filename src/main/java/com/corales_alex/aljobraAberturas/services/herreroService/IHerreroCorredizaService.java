package com.corales_alex.aljobraAberturas.services.herreroService;

import java.util.List;

import com.corales_alex.aljobraAberturas.models.herrero.HerreroCorrediza;


// Alt Gr + Shift + Z // <
// Alt Gr + Shift + X // >
public interface IHerreroCorredizaService {
    public HerreroCorrediza createHerreroCorrediza(HerreroCorrediza herreroCorrediza);
    public List<HerreroCorrediza> getAllHerreroCorredizas();
    public void updateHerreroCorrediza();
    public void deleteHerreroCorrediza();
}
