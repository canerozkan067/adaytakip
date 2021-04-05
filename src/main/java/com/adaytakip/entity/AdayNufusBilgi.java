package com.adaytakip.entity;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "nufus_bilgi")
public class AdayNufusBilgi {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "il")
    private String il;

    @Column(name = "ilce")
    private String ilce;

    @Column(name = "mahalle")
    private String mahalle;

    @Column(name = "cilt_no")
    private int ciltNo;

    @Column(name = "aile_sira_no")
    private int aileSiraNo;

    @Column(name = "sira_no")
    private int siraNo;

    @Column(name = "cuzdan_seri")
    private String cuzdanSeri;

    @Column(name = "cuzdan_no")
    private int cuzdanNo;

    @Column(name = "tc_kimlik_no")
    private int tcKimlikNo;
}
