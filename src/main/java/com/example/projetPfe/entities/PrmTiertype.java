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
@Table(name = "prm_tiertype")
public class PrmTiertype {
    @Id
    @Column(name = "ptit_uid", nullable = false)
    private Integer id;

    @Column(name = "ptit_cod", length = 20)
    private String ptitCod;

}