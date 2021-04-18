package com.adaytakip.service.impl;

import com.adaytakip.dto.AdayAdresDto;
import com.adaytakip.dto.AdayDto;
import com.adaytakip.entity.Aday;
import com.adaytakip.entity.AdayAdres;
import com.adaytakip.repository.AdayAdresRepository;
import com.adaytakip.repository.AdayRepository;
import com.adaytakip.service.AdayService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.attribute.standard.Destination;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;


@Service
@Transactional
public class AdayServiceImpl implements AdayService {

    @Autowired
    private AdayRepository adayRepository;

    @Autowired
    private AdayAdresRepository adayAdresRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<AdayDto> tumAdaylariGetir() {
        List<Aday> adayList = adayRepository.findAll();
        return adayList.stream().map(aday -> modelMapper.map(aday,AdayDto.class)).collect(Collectors.toList());
    }

    @Override
    public List<AdayAdresDto> tumAdayAdresleriGetir() {
        List<AdayAdres> adayAdresList = adayAdresRepository.findAll();
        return adayAdresList.stream().map(adayAdres -> modelMapper.map(adayAdres,AdayAdresDto.class)).collect(Collectors.toList());
    }

//    @Override
//    public AdayDto adayGetirId(UUID id) {
//        Optional<Aday> aday = adayRepository.findById(id);
//        return aday.orElse(null);
//    }

//    @Override
//    public AdayDto adayGetir(Aday aday) {
//        if (aday.getAd() != null) {
//            return adayRepository.findByAd(aday.getAd());
//        } else if (aday.getId() != null) {
//            return adayRepository.getOne(aday.getId());
//        } else {
//            return null;
//        }
//    }

//    @Override
//    public Aday adayOlustur(AdayDto aday) {
//        return adayRepository.save(aday);
//    }

//    @Override
//    public AdayDto adayGuncelle(UUID id, AdayDto aday) {
//        Aday adayid = adayRepository.getOne(id);
//        if (adayid == null) {
//            throw new IllegalArgumentException("Aday Id Gereklidir");
//        }
//
//        adayid.setAd(aday.getAd());
//        adayid.setSoyad(aday.getSoyad());
//        adayid.setEmail(aday.getEmail());
//        return null;//adayRepository.save(adayid);
//
//    }

//    @Override
//    public Boolean adaySil(UUID id) {
//        adayRepository.deleteById(id);
//        return true;
//    }

//    @Override
//    public void adaySilByAd(AdayDto aday) {
//        Aday aday1 = adayRepository.findByAd(aday.getAd());
//        adayRepository.delete(aday1);
//    }



}
