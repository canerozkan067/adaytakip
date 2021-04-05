package com.adaytakip.service.impl;

import com.adaytakip.entity.Aday;
import com.adaytakip.repository.AdayRepository;
import com.adaytakip.service.AdayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


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
        Optional<Aday> aday = adayRepository.findById(id);
        return aday.orElse(null);
    }

    @Override
    public Aday adayGetir(Aday aday) {
        if (aday.getAd() != null) {
            return adayRepository.findByAd(aday.getAd());
        } else if (aday.getId() != null) {
            return adayRepository.getOne(aday.getId());
        } else {
            return null;
        }
    }

    @Override
    public Aday adayOlustur(Aday aday) {
        //ekle veya kaydet olarak değiştirmem gerek
        Aday yeniAday = adayRepository.save(aday);
        return yeniAday;
    }

    @Override
    public Aday adayGuncelle(Long id, Aday aday) {
        Aday adayid = adayRepository.getOne(id);
        if (adayid == null) {
            throw new IllegalArgumentException("Aday Id Gereklidir");
            //fırlattım
        }

        adayid.setAd(aday.getAd());
        adayid.setSoyad(aday.getSoyad());
        adayid.setEmail(aday.getEmail());
        return adayRepository.save(adayid);

    }

    @Override
    public Boolean adaySil(Long id) {
        adayRepository.deleteById(id);
        return true;
    }

    @Override
    public Boolean adaySilByAd(Aday aday) {
        Aday aday1 = adayRepository.findByAd(aday.getAd());
        adayRepository.delete(aday1);
        return true;
    }


}
