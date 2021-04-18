package com.adaytakip.service;

import com.adaytakip.dto.AdayAdresDto;
import com.adaytakip.dto.AdayDto;
import com.adaytakip.entity.Aday;


import java.util.List;
import java.util.UUID;

public interface AdayService {

    List<AdayDto> tumAdaylariGetir();

    List<AdayAdresDto> tumAdayAdresleriGetir();

//    AdayDto adayGetirId(UUID id);
//
//    AdayDto adayGetir(AdayDto aday);
//
//    AdayDto adayOlustur(AdayDto aday);
//
//    AdayDto adayGuncelle(UUID id, AdayDto aday);
//
//    Boolean adaySil(UUID id);
//
//    void adaySilByAd(AdayDto aday);

}
