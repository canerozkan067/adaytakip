package com.adaytakip.controller;

import com.adaytakip.dto.AdayAdresDto;
import com.adaytakip.dto.AdayDto;
import com.adaytakip.entity.Aday;
import com.adaytakip.service.AdayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/api")
public class AdayController {

    @Autowired
    private AdayService adayService;

    @GetMapping("/adaylar")
    public ResponseEntity<List<AdayDto>> tumAdaylariGetir() {
        return ResponseEntity.ok(adayService.tumAdaylariGetir());
    }

    @GetMapping("/adayAddress")
    public ResponseEntity<List<AdayAdresDto>> tumAdayAdresleriGetir() {
        return ResponseEntity.ok(adayService.tumAdayAdresleriGetir());
    }

//    @GetMapping("/aday/{id}")
//    public ResponseEntity<AdayDto> adayGetirById(@PathVariable("id") UUID id) {
//        return ResponseEntity.ok(adayService.adayGetirId(id));
//    }
//
//    @GetMapping("/adaygetir")
//    public ResponseEntity<AdayDto> adayGetirByAd(@RequestBody AdayDto aday) {
//        return ResponseEntity.ok(adayService.adayGetir(aday));
//    }
//
//    @PostMapping("/adayekle")
//    public ResponseEntity<AdayDto> adayOlustur(@RequestBody AdayDto aday) {
//        return ResponseEntity.ok(adayService.adayOlustur(aday));
//    }
//
//    @PutMapping("/adayguncelle/{id}")
//    public ResponseEntity<AdayDto> adayGuncelle(@PathVariable(value = "id") UUID id, @RequestBody AdayDto aday) {
//        return ResponseEntity.ok(adayService.adayGuncelle(id, aday));
//
//    }
//
//    @DeleteMapping("/adaysil/{id}")
//    public ResponseEntity<Boolean> adaySil(@PathVariable(value = "id") UUID id) {
//        return ResponseEntity.ok(adayService.adaySil(id));
//    }
//
//    @DeleteMapping("/adaysilad")
//    public Boolean adaySilByAd(@RequestBody AdayDto aday) {
//        adayService.adaySilByAd(aday);
//        return true;
//    }

}
