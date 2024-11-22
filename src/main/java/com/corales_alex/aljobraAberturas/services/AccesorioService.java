package com.corales_alex.aljobraAberturas.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import com.corales_alex.aljobraAberturas.models.AccesorioModel;
import com.corales_alex.aljobraAberturas.models.herrero.HerreroCorrediza;
import com.corales_alex.aljobraAberturas.models.herrero.LineaHerrero;
import com.corales_alex.aljobraAberturas.repositorys.IAccesorioRepository;
import com.corales_alex.aljobraAberturas.repositorys.ILineaHerreroRepository;

@Service
public class AccesorioService implements IAccesorioService {

    @Autowired
    IAccesorioRepository iAccesorioRepository;
    @Autowired
    ILineaHerreroRepository iLineaHerreroRepository;

    @Override
    public void crearAccesorio() {
        AccesorioModel accesorioNuevo = new AccesorioModel();

        // Verificar si la lista de HerreroCorrediza es nula, si lo es, inicializarla
        if (accesorioNuevo.getLineaHerrero() == null) {
            accesorioNuevo.setLineaHerrero(new LineaHerrero());
        }

        if (accesorioNuevo.getLineaHerrero().getHerreroCorrediza() == null) {
            accesorioNuevo.getLineaHerrero().setHerreroCorrediza(new ArrayList<>()); // Inicializa la lista si es null
        }

        if (accesorioNuevo.getLineaHerrero().getIdLineaHerrero() == null) {
            iLineaHerreroRepository.save(accesorioNuevo.getLineaHerrero());
        }

        // Ahora puedes agregar elementos sin problemas
        accesorioNuevo.getLineaHerrero().getHerreroCorrediza()
                .add(new HerreroCorrediza("Parte A", "Escuadra", 100, 0, 0));
        accesorioNuevo.getLineaHerrero().getHerreroCorrediza()
                .add(new HerreroCorrediza("Simple", "Rueda simple plastica", 100, 0, 0));
        accesorioNuevo.getLineaHerrero().getHerreroCorrediza()
                .add(new HerreroCorrediza("S.Ruleman", "Rueda simple con ruleman", 100, 0, 0));
        accesorioNuevo.getLineaHerrero().getHerreroCorrediza()
                .add(new HerreroCorrediza("Doble", "Rueda doble plastica", 100, 0, 0));
        accesorioNuevo.getLineaHerrero().getHerreroCorrediza()
                .add(new HerreroCorrediza("D.Ruleman", "Rueda doble con ruleman", 20, 0, 0));
        accesorioNuevo.getLineaHerrero().getHerreroCorrediza()
                .add(new HerreroCorrediza("", "Aldaba central", 50, 0, 0));

        // Guardar el accesorio en el repositorio
        iAccesorioRepository.save(accesorioNuevo);
    }

    @Override
    public List<AccesorioModel> getAllAccesorio(Long id) {
        return iAccesorioRepository.findAll();
    }

    @Override
    public void updateAccesorio(Long id, AccesorioModel accesorios) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateAccesorio'");
    }

}
