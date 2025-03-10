package com.example.projetPfe.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "grh_categories")
public class GrhCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ctgr_uid", nullable = false)
    private Integer id;

    @Column(name = "ctgr_cod", length = 20)
    private String ctgrCod;

    @OneToMany(mappedBy = "ctgrUid")
    private Set<GrhEmploye> grhEmployes = new LinkedHashSet<>();

}