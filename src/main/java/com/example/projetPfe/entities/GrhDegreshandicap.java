package com.example.projetPfe.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "grh_degreshandicaps")
public class GrhDegreshandicap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dhdc_uid", nullable = false)
    private Integer id;

    @Column(name = "dhdc_cod", length = 20)
    private String dhdcCod;

    @OneToMany(mappedBy = "dhdcUid")
    private Set<GrhEmploye> grhEmployes = new LinkedHashSet<>();

}