package com.adaytakip.service;

import com.adaytakip.entity.Aday;

import java.util.List;

public interface AdayService {

    List<Aday> tumAdaylariGetir();

    Aday adayGetirId(Long id);

    Aday adayGetirAd(String ad);




}
