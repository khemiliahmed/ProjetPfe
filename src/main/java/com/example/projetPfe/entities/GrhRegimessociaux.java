package com.example.projetPfe.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "grh_regimessociaux")
public class GrhRegimessociaux {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rscs_uid", nullable = false)
    private Integer id;

    @Column(name = "rscs_cod", length = 20)
    private String rscsCod;

    @OneToMany(mappedBy = "rscsUid")
    private Set<GrhEmploye> grhEmployes = new LinkedHashSet<>();

}