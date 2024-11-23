package com.corales_alex.aljobraAberturas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corales_alex.aljobraAberturas.models.AccesorioModel;
import com.corales_alex.aljobraAberturas.services.AccesorioService;

@RestController
@RequestMapping("/accesorios")
public class AccesorioController {
    
    @Autowired
    private AccesorioService accesorioService;

    @PostMapping 
    public String createAccesorio(){
        accesorioService.crearAccesorio();
        return "Accesorio creado con exito"; 
    }

    @GetMapping("/buscar/{id}")
    public AccesorioModel getAllAccesorio (@PathVariable Long id){
        return accesorioService.getAllAccesorio(id);
    }
}
