package com.example.projetPfe.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "grh_specialitesdiplomes")
public class GrhSpecialitesdiplome {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sdpl_uid", nullable = false)
    private Integer id;

    @Column(name = "sdpl_cod", length = 20)
    private String sdplCod;

    @OneToMany(mappedBy = "sdplUid")
    private Set<GrhEmploye> grhEmployes = new LinkedHashSet<>();

}