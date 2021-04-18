package com.adaytakip.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Data
public abstract class BaseDto implements Serializable {

    private UUID id;

    private Long status;

    private Date createdAt;

    private Date updatedAt;

    private UUID createdBy;

    private UUID updatedBy;
}
