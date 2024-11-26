package com.corales_alex.aljobraAberturas.repositorys.herreroRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corales_alex.aljobraAberturas.models.herrero.PrecioAluminio;

public interface IPrecioAluminioRepository extends JpaRepository<PrecioAluminio, Long> {
     
}
