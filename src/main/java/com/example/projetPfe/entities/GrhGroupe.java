package com.example.projetPfe.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "grh_groupes")
public class GrhGroupe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "grpe_uid", nullable = false)
    private Integer id;

    @Column(name = "grpe_cod", length = 20)
    private String grpeCod;

    @OneToMany(mappedBy = "grpeUid")
    private Set<GrhEmploye> grhEmployes = new LinkedHashSet<>();

}