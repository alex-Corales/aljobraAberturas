package com.corales_alex.aljobraAberturas.repositorys.tornilloGomaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.corales_alex.aljobraAberturas.models.tornilloGoma.TornilloGoma;

@Repository
public interface ITornilloGomaRepository extends JpaRepository<TornilloGoma, Long>{
    
}
