package com.adaytakip.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "aday")
@Getter
@Setter
@NoArgsConstructor
@SQLDelete(sql = "update aday set status = 2 where id = ?")
@Where(clause = "status != 2")
public class Aday extends BaseEntity {

    @Column(name = "ad")
    private String ad;

    @Column(name = "soyad")
    private String soyad;

    @Column(name = "email")
    private String email;

    @Column(name = "dogum_yeri")
    private String dogumYeri;

    @Temporal(TemporalType.DATE)
    @Column(name = "dogum_tarihi")
    private Date dogumTarihi;


}
