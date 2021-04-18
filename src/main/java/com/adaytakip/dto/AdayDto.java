package com.adaytakip.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class AdayDto extends BaseDto {

    private String ad;

    private String soyad;

    private String email;

    private String dogumYeri;

    private Date dogumTarihi;

}
