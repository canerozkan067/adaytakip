package com.adaytakip.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Entity
@Table(name = "aday")
@Data
@NoArgsConstructor
public class Aday {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "ad")
    private String ad;

    @Column(name = "soyad")
    private String soyad;

    //hibernate e mail kullanılacak
    @Column(name = "email")
    private String email;

    @Column(name = "dogum_yeri")
    private String dogumYeri;

    @Temporal(TemporalType.DATE)
    @Column(name = "dogum_tarihi")
    private Date dogumTarihi;

    @JoinColumn(name = "aday_adres")
    @OneToMany(fetch = FetchType.EAGER)
    private List<AdayAdres> adayAdres; //join

    @JoinColumn(name = "aday_nufus_bilgi")
    @OneToOne(fetch = FetchType.EAGER)
    private AdayNufusBilgi adayNufusBilgi; //join

    /*@JoinColumn(name = "aday_diger_bilgi")
    @OneToOne(fetch = FetchType.LAZY)
    private AdayDigerBilgi digerBilgi; //join*/
}
