package com.adaytakip.repository;

import com.adaytakip.entity.Aday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AdayRepository extends JpaRepository<Aday, UUID> {

    Aday findByAd(String ad);
}
