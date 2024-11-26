package com.corales_alex.aljobraAberturas.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.corales_alex.aljobraAberturas.models.Mampara;

@Repository
public interface IMamparaRepository extends JpaRepository<Mampara, Long>{

}
