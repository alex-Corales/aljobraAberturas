package com.corales_alex.aljobraAberturas.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.corales_alex.aljobraAberturas.models.AccesorioModel;
import com.corales_alex.aljobraAberturas.models.herrero.HerreroCorrediza;
import com.corales_alex.aljobraAberturas.models.herrero.LineaHerrero;
import com.corales_alex.aljobraAberturas.repositorys.IAccesorioRepository;
import com.corales_alex.aljobraAberturas.repositorys.IHerreroCorrizaRepository;
import com.corales_alex.aljobraAberturas.repositorys.ILineaHerreroRepository;

@Service
public class AccesorioService implements IAccesorioService {

    @Autowired
    IAccesorioRepository iAccesorioRepository;
    @Autowired
    ILineaHerreroRepository iLineaHerreroRepository;
    @Autowired
    IHerreroCorrizaRepository iHerreroCorrizaRepository;

    @Override
public void crearAccesorio() {
    AccesorioModel accesorioNuevo = new AccesorioModel();
    
    // Crear la instancia de LineaHerrero y guardarla en la base de datos primero
    LineaHerrero lineaHerrero = new LineaHerrero();
    iLineaHerreroRepository.save(lineaHerrero);  // Guardar primero para que tenga un ID asignado
    
    List<HerreroCorrediza> listaHerreroCorredizas = new ArrayList<>();

    // Crear y asociar cada HerreroCorrediza a la instancia guardada de LineaHerrero
    HerreroCorrediza herrero1 = new HerreroCorrediza("Parte A", "Escuadra", 100, 0, 0);
    HerreroCorrediza herrero2 = new HerreroCorrediza("Simple", "Rueda simple plastica", 100, 0, 0);
    HerreroCorrediza herrero3 = new HerreroCorrediza("S.Ruleman", "Rueda simple con ruleman", 100, 0, 0);
    HerreroCorrediza herrero4 = new HerreroCorrediza("Doble", "Rueda doble plastica", 100, 0, 0);
    HerreroCorrediza herrero5 = new HerreroCorrediza("D.Ruleman", "Rueda doble con ruleman", 20, 0, 0);
    HerreroCorrediza herrero6 = new HerreroCorrediza("", "Aldaba central", 50, 0, 0);

    // Asignar la LineaHerrero a cada HerreroCorrediza
    herrero1.setLineaHerrero(lineaHerrero);
    herrero2.setLineaHerrero(lineaHerrero);
    herrero3.setLineaHerrero(lineaHerrero);
    herrero4.setLineaHerrero(lineaHerrero);
    herrero5.setLineaHerrero(lineaHerrero);
    herrero6.setLineaHerrero(lineaHerrero);

    // Agregar cada HerreroCorrediza a la lista
    listaHerreroCorredizas.add(herrero1);
    listaHerreroCorredizas.add(herrero2);
    listaHerreroCorredizas.add(herrero3);
    listaHerreroCorredizas.add(herrero4);
    listaHerreroCorredizas.add(herrero5);
    listaHerreroCorredizas.add(herrero6);

    // Guardar todas las instancias de HerreroCorrediza en la base de datos
    iHerreroCorrizaRepository.saveAll(listaHerreroCorredizas);

    // Asignar la lista de HerreroCorrediza a LineaHerrero (opcional si necesitas sincronizar la relación en memoria)
    lineaHerrero.setHerreroCorrediza(listaHerreroCorredizas);

    // Guardar la asociación de LineaHerrero en AccesorioModel y guardar AccesorioModel
    accesorioNuevo.setLineaHerrero(lineaHerrero);
    iAccesorioRepository.save(accesorioNuevo);
}


    @Override
    public AccesorioModel getAllAccesorio(Long id) {
        return iAccesorioRepository.findById(id).orElse(null);
    }

    @Override
    public void updateAccesorio(Long id, AccesorioModel accesorios) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateAccesorio'");
    }

}
