package com.adaytakip.controller;

import com.adaytakip.entity.Aday;
import com.adaytakip.service.AdayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
