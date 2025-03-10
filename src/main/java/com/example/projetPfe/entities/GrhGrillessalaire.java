package com.example.projetPfe.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "grh_grillessalaires")
public class GrhGrillessalaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gslr_uid", nullable = false)
    private Integer id;

    @Column(name = "gslr_cod", length = 20)
    private String gslrCod;

    @OneToMany(mappedBy = "gslrUid")
    private Set<GrhEmploye> grhEmployes = new LinkedHashSet<>();

}