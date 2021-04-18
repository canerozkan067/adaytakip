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
public class AdayNufusDto extends BaseDto{

    private Aday aday;

    private String il;

    private String ilce;

    private String mahalle;

    private Integer ciltNo;

    private Integer aileSiraNo;

    private Integer siraNo;

    private String cuzdanSeri;

    private Integer cuzdanNo;

    private Long tcKimlikNo;
}
