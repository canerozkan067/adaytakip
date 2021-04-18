package com.adaytakip.dto;

import com.adaytakip.entity.Aday;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class AdayAdresDto extends BaseDto{

    private Aday aday;

    private String adres;

    private String cadde;

    private String sokak;

    private String binaNo;

    private String daireNo;

    private Integer postaKodu;
}
