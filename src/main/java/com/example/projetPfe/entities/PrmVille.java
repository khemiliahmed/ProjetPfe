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
@Table(name = "prm_villes")
public class PrmVille {
    @Id
    @Column(name = "vill_uid", nullable = false)
    private Integer id;

    @Column(name = "vill_cod", length = 20)
    private String villCod;

}