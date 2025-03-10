package com.example.projetPfe.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "grh_positions")
public class GrhPosition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pstn_uid", nullable = false)
    private Integer id;

    @Column(name = "pstn_cod", length = 20)
    private String pstnCod;

    @OneToMany(mappedBy = "pstnUid")
    private Set<GrhEmploye> grhEmployes = new LinkedHashSet<>();

}