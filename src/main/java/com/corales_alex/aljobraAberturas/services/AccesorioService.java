package com.corales_alex.aljobraAberturas.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.corales_alex.aljobraAberturas.models.Accesorio;
import com.corales_alex.aljobraAberturas.models.herrero.HerreroCorrediza;
import com.corales_alex.aljobraAberturas.models.herrero.LineaHerrero;
import com.corales_alex.aljobraAberturas.models.herrero.MargenDeGanancia;
import com.corales_alex.aljobraAberturas.models.herrero.Mosquitero;
import com.corales_alex.aljobraAberturas.models.herrero.PrecioAluminio;
import com.corales_alex.aljobraAberturas.models.herrero.PuertaDeRabatir;
import com.corales_alex.aljobraAberturas.models.herrero.RajaProyectanteBanderola;
import com.corales_alex.aljobraAberturas.models.tornilloGoma.TornilloGoma;
import com.corales_alex.aljobraAberturas.models.vidrio.Vidrio;
import com.corales_alex.aljobraAberturas.repositorys.IAccesorioRepository;
import com.corales_alex.aljobraAberturas.repositorys.herreroRepository.IHerreroCorrizaRepository;
import com.corales_alex.aljobraAberturas.repositorys.herreroRepository.ILineaHerreroRepository;
import com.corales_alex.aljobraAberturas.repositorys.herreroRepository.IMargenDeGananciaRepository;
import com.corales_alex.aljobraAberturas.repositorys.herreroRepository.IMosquiteroRepository;
import com.corales_alex.aljobraAberturas.repositorys.herreroRepository.IPrecioAluminioRepository;
import com.corales_alex.aljobraAberturas.repositorys.herreroRepository.IPuertaDeRabatirRepository;
import com.corales_alex.aljobraAberturas.repositorys.herreroRepository.IRajaProyectanteBanderolaRepository;
import com.corales_alex.aljobraAberturas.repositorys.tornilloGomaRepository.ITornilloGomaRepository;
import com.corales_alex.aljobraAberturas.repositorys.vidrioRepository.IVidrioRepository;

@Service
public class AccesorioService implements IAccesorioService {

    @Autowired
    private IAccesorioRepository iAccesorioRepository;
    @Autowired
    private ILineaHerreroRepository iLineaHerreroRepository;
    @Autowired
    private IRajaProyectanteBanderolaRepository iRajaProyectanteBanderolaRepository;
    @Autowired
    private IMosquiteroRepository iMosquiteroRepository;
    @Autowired
    private IPuertaDeRabatirRepository iPuertaDeRabatirRepository;
    @Autowired
    private IPrecioAluminioRepository iPrecioAluminioRepository;
    @Autowired
    private IMargenDeGananciaRepository iMargenDeGananciaRepository;
    @Autowired
    private IVidrioRepository iVidrioRepository;
    @Autowired
    private ITornilloGomaRepository iTornilloGomaRepository;
    @Autowired
    private IHerreroCorrizaRepository iHerreroCorrizaRepository;
    

    @Override
    public void crearAccesorio(Accesorio accesorio) {

        if(accesorio.getIdAccesorio() != null){
            crearYGuardarAccesorio(accesorio);
        }else{ 
            // Crear y guardar LineaHerrero
            LineaHerrero lineaHerrero = crearYGuardarLineaHerrero();

            // Crear y guardar HerreroCorredizas asociadas a LineaHerrero
            List<HerreroCorrediza> listaHerreroCorredizas = crearYGuardarHerreroCorredizas(lineaHerrero);

            // Crear y guardar RajaProyectanteBanderolas asociadas a LineaHerrero
            List<RajaProyectanteBanderola> listaRajaProyectanteBanderolas = crearYGuardarRajaProyectanteBanderolas(
                    lineaHerrero);

            List<Mosquitero> mosquiteros = crearYGuardarsMosquiteros(lineaHerrero);

            List<PuertaDeRabatir> puertasDeRebatir = crearYGuardarPuertaDeRabatir(lineaHerrero);

            PrecioAluminio precioAluminio = crearYGuardarPrecioAluminio(lineaHerrero);

            MargenDeGanancia margenDeGanancia = crearYGuardarMargenDeGanancia(lineaHerrero);

            // Asignar las listas a LineaHerrero
            lineaHerrero.setHerreroCorrediza(listaHerreroCorredizas);
            lineaHerrero.setRajaProyectanteBanderola(listaRajaProyectanteBanderolas);
            lineaHerrero.setMosquitero(mosquiteros);
            lineaHerrero.setPuertaDeRabatir(puertasDeRebatir);
            lineaHerrero.setPrecioAluminio(precioAluminio);
            lineaHerrero.setMargenDeGanancia(margenDeGanancia);

            // Crear y guardar AccesorioModel
            Accesorio accesorioNuevo = crearYGuardarAccesorio(accesorio);

            // Asignar LineaHerrero a AccesorioModel
            accesorioNuevo.setLineaHerrero(lineaHerrero);

            List<Vidrio> vidrio = crearYGuardarVidrio(accesorioNuevo);
            List<TornilloGoma> tornilloGoma = crearYGuardarTornillosGomas(accesorioNuevo);

            // Asignar Vidrios y Tornillos a AccesorioModel
            accesorioNuevo.setVidrio(vidrio);
            accesorioNuevo.setTornilloGoma(tornilloGoma);

            // Guardar el accesorio con la referencia de LineaHerrero
            iAccesorioRepository.save(accesorioNuevo);
        }
    }

    private Accesorio crearYGuardarAccesorio(Accesorio accesorio) {
        //Accesorio accesorioModel = new Accesorio();
        return iAccesorioRepository.save(accesorio);
    }

    private LineaHerrero crearYGuardarLineaHerrero() {
        LineaHerrero lineaHerrero = new LineaHerrero();
        iLineaHerreroRepository.save(lineaHerrero);
        return lineaHerrero;
    }

    private List<HerreroCorrediza> crearYGuardarHerreroCorredizas(LineaHerrero lineaHerrero) {
        List<HerreroCorrediza> listaHerreroCorredizas = new ArrayList<>(Arrays.asList(
                new HerreroCorrediza("Parte A", "Escuadra", 100, 0, 0, lineaHerrero),
                new HerreroCorrediza("Simple", "Rueda simple plastica", 100, 0, 0, lineaHerrero),
                new HerreroCorrediza("S.Ruleman", "Rueda simple con ruleman", 100, 0, 0, lineaHerrero),
                new HerreroCorrediza("Doble", "Rueda doble plastica", 100, 0, 0, lineaHerrero),
                new HerreroCorrediza("D.Ruleman", "Rueda doble con ruleman", 20, 0, 0, lineaHerrero),
                new HerreroCorrediza("", "Aldaba central", 50, 0, 0, lineaHerrero)));

        iHerreroCorrizaRepository.saveAll(listaHerreroCorredizas);
        return listaHerreroCorredizas;
    }

    private List<RajaProyectanteBanderola> crearYGuardarRajaProyectanteBanderolas(LineaHerrero lineaHerrero) {
        List<RajaProyectanteBanderola> listaRajaProyectanteBanderolas = new ArrayList<>(Arrays.asList(
                new RajaProyectanteBanderola("Parte C", "Escuadra postigo / raja", 50, 0, 0, lineaHerrero),
                new RajaProyectanteBanderola("H33", "Bisagra postigo / raja", 12, 0, 0, lineaHerrero),
                new RajaProyectanteBanderola("Franca 20", "Brazo de empuje coplana", 1, 0, 0, lineaHerrero),
                new RajaProyectanteBanderola("Franca 30", "Brazo de empuje coplana", 1, 0, 0, lineaHerrero),
                new RajaProyectanteBanderola("Franca 40", "Brazo de empuje coplana", 1, 0, 0, lineaHerrero),
                new RajaProyectanteBanderola("CP5", "Aldaba raja herrero", 1, 0, 0, lineaHerrero),
                new RajaProyectanteBanderola("H-14 chingolito", "Traba postigon / banderola", 1, 0, 0, lineaHerrero)));

        iRajaProyectanteBanderolaRepository.saveAll(listaRajaProyectanteBanderolas);
        return listaRajaProyectanteBanderolas;
    }

    private List<Mosquitero> crearYGuardarsMosquiteros(LineaHerrero lineaHerrero) {
        List<Mosquitero> listaMosquiteros = new ArrayList<>(Arrays.asList(
                new Mosquitero("Parte B", "Escuadra mosquitero", 100, 0, 0, lineaHerrero),
                new Mosquitero("Simple", "Rueda mosquitero simple", 1, 0, 0, lineaHerrero),
                new Mosquitero("Ruleman", "Rueda mosquitero con ruleman", 1, 0, 0, lineaHerrero),
                new Mosquitero("", "Patin mosquitero", 0, 100, 0, lineaHerrero),
                new Mosquitero("Bisagra", "Bisagra mosquitero", 0, 1, 0, lineaHerrero)));

        iMosquiteroRepository.saveAll(listaMosquiteros);
        return listaMosquiteros;
    }

    private List<PuertaDeRabatir> crearYGuardarPuertaDeRabatir(LineaHerrero lineaHerrero) {
        List<PuertaDeRabatir> listaPuertasDeRebatir = new ArrayList<>(Arrays.asList(
                new PuertaDeRabatir("FLH1", "Bisagra puerta de abrir", 12, 0, 0, lineaHerrero),
                new PuertaDeRabatir("Cerradura", "Puerta 36mm", 1, 0, 0, lineaHerrero),
                new PuertaDeRabatir("", "Manija de aluminio", 1, 0, 0, lineaHerrero)));

        iPuertaDeRabatirRepository.saveAll(listaPuertasDeRebatir);
        return listaPuertasDeRebatir;
    }

    private PrecioAluminio crearYGuardarPrecioAluminio(LineaHerrero lineaHerrero) {
        PrecioAluminio precioAluminio = new PrecioAluminio(0, 0, 0, 0, lineaHerrero);

        iPrecioAluminioRepository.save(precioAluminio);
        return precioAluminio;
    }

    private MargenDeGanancia crearYGuardarMargenDeGanancia(LineaHerrero lineaHerrero) {
        MargenDeGanancia margenDeGanancia = new MargenDeGanancia(0, 0, 0, 0, lineaHerrero);

        iMargenDeGananciaRepository.save(margenDeGanancia);
        return margenDeGanancia;
    }

    private List<Vidrio> crearYGuardarVidrio(Accesorio accesorioModel) {
        List<Vidrio> vidrio = new ArrayList<>(Arrays.asList(
                new Vidrio("Vidrio 3mm", 0, 0, 0, accesorioModel),
                new Vidrio("Vidrio 4mm", 0, 0, 0, accesorioModel),
                new Vidrio("Vidrio laminado 3+3", 0, 0, 0, accesorioModel),
                new Vidrio("Vidrio DVH 4-9-4", 0, 0, 0, accesorioModel),
                new Vidrio("Vidrio DVH 3+3-9-4", 0, 0, 0, accesorioModel),
                new Vidrio("Vidrio DVH 3+3-9+3+3", 0, 0, 0, accesorioModel),
                new Vidrio("Vidrio 5mm", 0, 0, 0, accesorioModel),
                new Vidrio("Vidrio 6mm", 0, 0, 0, accesorioModel),
                new Vidrio("Vidrio DVH 3+3-9+5", 0, 0, 0, accesorioModel),
                new Vidrio("Vidrio DVH 3+3-9+6", 0, 0, 0, accesorioModel),
                new Vidrio("Tela mosquitera", 0, 0, 0, accesorioModel)));

        iVidrioRepository.saveAll(vidrio);
        return vidrio;
    }

    private List<TornilloGoma> crearYGuardarTornillosGomas(Accesorio accesorioModel) {
        List<TornilloGoma> tornilloGoma = new ArrayList<>(Arrays.asList(
                new TornilloGoma("Parker 9 x 38", 1000, 0, 0, accesorioModel),
                new TornilloGoma("Autoperforante pan framing", 1000, 0, 0, accesorioModel),
                new TornilloGoma("Hexagonal 1 1/2", 500, 0, 0, accesorioModel),
                new TornilloGoma("Punta aguja negro 6 x 1", 500, 0, 0, accesorioModel),
                new TornilloGoma("Cordon mosquitero 4.5 mm", 100, 0, 0, accesorioModel),
                new TornilloGoma("Universal pesado", 100, 0, 0, accesorioModel),
                new TornilloGoma("Paraguaya grande", 100, 0, 0, accesorioModel),
                new TornilloGoma("Felpa PVC", 100, 0, 0, accesorioModel),
                new TornilloGoma("Felta 7 x 6 con fin seal", 300, 0, 0, accesorioModel)));

        iTornilloGomaRepository.saveAll(tornilloGoma);
        return tornilloGoma;
    }

    @Override
    public Accesorio getAllAccesorio(Long id) {
        return iAccesorioRepository.findById(id).orElse(null);
    }

    @Override
    public void updateAccesorio(Long id, Accesorio accesorioNuevo) {
        //Accesorio accesorioExistente = this.getAllAccesorio(id);

        /*accesorioExistente.getLineaHerrero().setHerreroCorrediza(accesorioNuevo.getLineaHerrero().getHerreroCorrediza());
        accesorioExistente.getLineaHerrero().setRajaProyectanteBanderola(accesorioNuevo.getLineaHerrero().getRajaProyectanteBanderola());
        accesorioExistente.getLineaHerrero().setMosquitero(accesorioNuevo.getLineaHerrero().getMosquitero());
        accesorioExistente.getLineaHerrero().setPuertaDeRabatir(accesorioNuevo.getLineaHerrero().getPuertaDeRabatir());
        accesorioExistente.getLineaHerrero().setPrecioAluminio(accesorioNuevo.getLineaHerrero().getPrecioAluminio());
        accesorioExistente.getLineaHerrero().setMargenDeGanancia(accesorioNuevo.getLineaHerrero().getMargenDeGanancia());
        accesorioExistente.setLineaHerrero(accesorioNuevo.getLineaHerrero());
        accesorioExistente.setVidrio(accesorioNuevo.getVidrio());
        accesorioExistente.setTornilloGoma(accesorioNuevo.getTornilloGoma());*/
        
        this.crearAccesorio(accesorioNuevo);
        
    }

}
