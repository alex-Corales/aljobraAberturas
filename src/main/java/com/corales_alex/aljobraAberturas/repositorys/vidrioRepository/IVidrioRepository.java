package com.corales_alex.aljobraAberturas.repositorys.vidrioRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.corales_alex.aljobraAberturas.models.vidrio.Vidrio;

@Repository
public interface IVidrioRepository extends JpaRepository<Vidrio, Long>{
    
}
