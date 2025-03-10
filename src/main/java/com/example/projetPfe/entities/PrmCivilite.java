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
@Table(name = "prm_civilites")
public class PrmCivilite {
    @Id
    @Column(name = "cvlt_uid", nullable = false)
    private Integer id;

    @Column(name = "cvlt_cod", length = 20)
    private String cvltCod;

}