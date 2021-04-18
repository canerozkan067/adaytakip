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
@Table(name = "aday_nufus")
@Getter
@Setter
@NoArgsConstructor
@SQLDelete(sql = "update aday_nufus set status = 2 where id = ? ")
@Where(clause = "status != 2")
public class AdayNufus extends BaseEntity{


    @OneToOne
    @JoinColumn(name = "aday_id")
    private Aday aday;

    @Column(name = "il")
    private String il;

    @Column(name = "ilce")
    private String ilce;

    @Column(name = "mahalle")
    private String mahalle;

    @Column(name = "cilt_no")
    private Integer ciltNo;

    @Column(name = "aile_sira_no")
    private Integer aileSiraNo;

    @Column(name = "sira_no")
    private Integer siraNo;

    @Column(name = "cuzdan_seri")
    private String cuzdanSeri;

    @Column(name = "cuzdan_no")
    private Integer cuzdanNo;

    @Column(name = "tc_kimlik_no")
    private Long tcKimlikNo;
}
