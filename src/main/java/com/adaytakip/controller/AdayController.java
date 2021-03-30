package com.adaytakip.controller;

import com.adaytakip.entity.Aday;
import com.adaytakip.service.AdayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AdayController {

    @Autowired
    private AdayService adayService;

    @GetMapping("/adaylar")
    public List<Aday> tumAdaylariGetir() {
        return adayService.tumAdaylariGetir();
    }

    @GetMapping("/aday/{id}")
    public Aday adayGetirById(@PathVariable("id") Long id) {
        return adayService.adayGetirId(id);
    }

    @GetMapping("/adaygetir")
    public Aday adayGetirByAd(@RequestBody Aday aday) {
        return adayService.adayGetir(aday);
    }

    @PostMapping("/adayekle")
    public Aday adayOlustur(@RequestBody Aday aday) {
        return adayService.adayOlustur(aday);
        //ResponseEntity
        //sorun yok

    }

    @PutMapping("/adayguncelle/{id}")
    public Aday adayGuncelle(@PathVariable(value ="id")Long id, @RequestBody Aday aday){
        return adayService.adayGuncelle(id,aday);

    }
    @DeleteMapping("/adaysil/{id}")
    public Boolean adaySil(@PathVariable(value = "id") Long id){
         adayService.adaySil(adayGetirById(id));

        return true;
    }
}
