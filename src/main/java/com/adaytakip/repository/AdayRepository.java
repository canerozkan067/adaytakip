package com.adaytakip.repository;

import com.adaytakip.entity.Aday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdayRepository extends JpaRepository<Aday,Long> {

    Aday findByAd(String ad);
}
