package com.example.projetPfe.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "grh_naturehandicap")
public class GrhNaturehandicap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nthn_uid", nullable = false)
    private Integer id;

    @Column(name = "nthn_cod", length = 20)
    private String nthnCod;

    @OneToMany(mappedBy = "nthnUid")
    private Set<GrhEmploye> grhEmployes = new LinkedHashSet<>();

}