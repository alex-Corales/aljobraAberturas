package com.corales_alex.aljobraAberturas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corales_alex.aljobraAberturas.models.Accesorio;
import com.corales_alex.aljobraAberturas.services.AccesorioService;

@RestController
@RequestMapping("/accesorios")
public class AccesorioController {

    @Autowired
    private AccesorioService accesorioService;

    @PostMapping
    public ResponseEntity<String> createAccesorio() {
        try {
            accesorioService.crearAccesorio(new Accesorio());
            return ResponseEntity.ok("Accesorio creado con éxito");
        } catch (Exception e) {
            // Loguear el error (opcional)
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error interno en el servidor: " + e.getMessage());
        }
    }

    @GetMapping("/buscar/{id}")
    public Accesorio getAllAccesorio(@PathVariable Long id) {
        return accesorioService.getAllAccesorio(id);
    }

    @PutMapping("/update/{id}")
    public String updateAccesorio(@PathVariable Long id, @RequestBody Accesorio accesorioNuevo){
        accesorioService.updateAccesorio(id, accesorioNuevo);
        return "El accesorio se actualizo con exito";
    }
}
