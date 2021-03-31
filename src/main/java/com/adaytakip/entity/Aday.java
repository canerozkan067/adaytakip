package com.adaytakip.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "aday")
@Data
public class Aday {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "ad")
    private String ad;
    @Column(name = "soyad")
    private String soyad;
    @Column(name = "email")
    private String email;
}
