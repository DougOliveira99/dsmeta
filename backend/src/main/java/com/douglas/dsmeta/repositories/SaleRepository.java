package com.douglas.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglas.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
