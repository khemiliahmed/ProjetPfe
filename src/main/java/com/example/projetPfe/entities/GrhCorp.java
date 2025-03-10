package com.example.projetPfe.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "grh_corps")
public class GrhCorp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "crps_uid", nullable = false)
    private Integer id;

    @Column(name = "crps_cod", length = 20)
    private String crpsCod;

    @OneToMany(mappedBy = "crpsUid")
    private Set<GrhEmploye> grhEmployes = new LinkedHashSet<>();

}