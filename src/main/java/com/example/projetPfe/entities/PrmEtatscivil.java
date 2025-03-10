package com.example.projetPfe.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "prm_etatscivils")
public class PrmEtatscivil {
    @Id
    @Column(name = "etcv_uid", nullable = false)
    private Integer id;

    @Column(name = "etcv_cod", length = 20)
    private String etcvCod;

}