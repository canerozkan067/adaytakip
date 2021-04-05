package com.adaytakip.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "aday_adres")
@Data
@NoArgsConstructor
public class AdayAdres {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "adres", length = 400)
    private String adres;

    @Column(name = "cadde")
    private String cadde;

    @Column(name = "sokak")
    private String sokak;

    @Column(name = "bina_no")
    private String binaNo;

    @Column(name = "daire_no")
    private String daireNo;

    @Column(name = "posta_kodu")
    private int postaKodu;

}
