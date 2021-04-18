package com.adaytakip.controller;

import com.adaytakip.entity.Aday;
import com.adaytakip.service.AdayService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
public class AdayController {


    @Autowired
    private AdayService adayService;

    @GetMapping("/adaylar")
    public List<Aday> tumAdaylariGetir() {
        log.debug("tüm adaylar çağırıldı");
        return adayService.tumAdaylariGetir();
    }

    @GetMapping("/aday/{id}")
    public ResponseEntity<Aday> adayGetirById(@PathVariable("id") Long id) {
        log.info(id+ "numaralı aday çağırıldı");
        if(adayService.adayGetirId(id)!=null)
        {
            return ResponseEntity.ok(adayService.adayGetirId(id));}
        else
            log.error("yanlış veri girişi {}");
            throw new IllegalArgumentException(id+ "'li kayıt bulunamadı");

    }

    @GetMapping("/adaygetir")
    public ResponseEntity<Aday> adayGetirByAd(@RequestBody Aday aday) {
        return ResponseEntity.ok(adayService.adayGetir(aday));
    }

    @PostMapping("/adayekle")
    public ResponseEntity<Aday> adayOlustur(@RequestBody Aday aday) {
        return ResponseEntity.ok(adayService.adayOlustur(aday));
        //ResponseEntity
        //sorun yok

    }

    @PutMapping("/adayguncelle/{id}")
    public ResponseEntity<Aday> adayGuncelle(@PathVariable(value = "id") Long id, @RequestBody Aday aday) {
        return ResponseEntity.ok(adayService.adayGuncelle(id, aday));

    }

    @DeleteMapping("/adaysil/{id}")
    public ResponseEntity<Boolean> adaySil(@PathVariable(value = "id") Long id) {
        return ResponseEntity.ok(adayService.adaySil(id));
     //bunda bi gariplik var ama çalışıyor.
    }

    @DeleteMapping("/adaysilad")
    public Boolean adaySilByAd(@RequestBody Aday aday) {
        adayService.adaySilByAd(aday);
        return true;
        //aynı isimde iki kişi varsa hata fırlatıyor
    }
    @DeleteMapping("/adaysilsoft/{id}")
    public Boolean adaySoftDelete(@PathVariable(value = "id") Long id){
        adayService.adaySoftDelete(id);
        return true;

    }
}
