package com.adaytakip.service;

import com.adaytakip.entity.Aday;

import java.util.List;

public interface AdayService {

    List<Aday> tumAdaylariGetir();

    Aday adayGetirId(Long id);

    Aday adayGetir(Aday aday);

    Aday adayOlustur(Aday aday);

    Aday adayGuncelle(Long id, Aday aday);

    Boolean adaySil(Aday aday);


}
