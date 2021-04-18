package com.adaytakip.repository;

import com.adaytakip.entity.AdayAdres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AdayAdresRepository extends JpaRepository<AdayAdres, UUID> {

}
