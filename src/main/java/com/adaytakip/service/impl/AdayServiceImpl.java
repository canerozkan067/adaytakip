package com.adaytakip.service.impl;

import com.adaytakip.entity.Aday;
import com.adaytakip.repository.AdayRepository;
import com.adaytakip.service.AdayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class AdayServiceImpl implements AdayService {

    @Autowired
    private AdayRepository adayRepository;

    @Override
    public List<Aday> tumAdaylariGetir() {
        return adayRepository.findAll();
    }

    @Override
    public Aday adayGetirId(Long id) {

        Aday idAday = adayRepository.getOne(id);
        return idAday;

    }

    @Override
    public Aday adayGetirAd(String ad) {
      return null;
    }


}
