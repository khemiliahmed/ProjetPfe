package com.example.projetPfe.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "grh_soupos")
public class GrhSoupo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "spos_uid", nullable = false)
    private Integer id;

    @Column(name = "spos_cod", length = 20)
    private String sposCod;

    @OneToMany(mappedBy = "sposUid")
    private Set<GrhEmploye> grhEmployes = new LinkedHashSet<>();

}