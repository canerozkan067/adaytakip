package com.adaytakip.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "aday_adres")
@Getter
@Setter
@NoArgsConstructor
@SQLDelete(sql = "update aday_adres set status = 2 where id = ? ")
@Where(clause = "status != 2")
public class AdayAdres extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "aday_id")
    public Aday aday;

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
    private Integer postaKodu;

}
