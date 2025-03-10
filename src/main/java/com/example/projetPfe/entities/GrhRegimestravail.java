package com.example.projetPfe.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "grh_regimestravail")
public class GrhRegimestravail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rtrv_uid", nullable = false)
    private Integer id;

    @Column(name = "rtrv_cod", length = 20)
    private String rtrvCod;

    @OneToMany(mappedBy = "rtrvUid")
    private Set<GrhEmploye> grhEmployes = new LinkedHashSet<>();

}