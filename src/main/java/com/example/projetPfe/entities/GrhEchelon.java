package com.example.projetPfe.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "grh_echelons")
public class GrhEchelon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "echn_uid", nullable = false)
    private Integer id;

    @Column(name = "echn_cod", length = 20)
    private String echnCod;

    @OneToMany(mappedBy = "echnUid")
    private Set<GrhEmploye> grhEmployes = new LinkedHashSet<>();

}