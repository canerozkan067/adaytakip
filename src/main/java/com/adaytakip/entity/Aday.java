package com.adaytakip.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Entity
@Table(name = "aday")
@Data

@NoArgsConstructor
@Where(clause = "status=1")
public class Aday extends BaseEntity {

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

    public void setStatus(Statu status) {
        this.status = status;
    }
    @Column(name = "status")
    private Statu status;



/*@JoinColumn(name = "aday_diger_bilgi")
    @OneToOne(fetch = FetchType.LAZY)
    private AdayDigerBilgi digerBilgi; //join*/
}
