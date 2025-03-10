package com.example.projetPfe.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "grh_postes")
public class GrhPoste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pste_uid", nullable = false)
    private Integer id;

    @Column(name = "pste_cod", length = 20)
    private String psteCod;

    @OneToMany(mappedBy = "psteUid")
    private Set<GrhEmploye> grhEmployes = new LinkedHashSet<>();

}