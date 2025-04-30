package com.example.projetPfe.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "prm_stuctures")
public class PrmStucture {
    @Id
    @ColumnDefault("nextval('prm_stuctures_strc_uid_seq')")
    @Column(name = "strc_uid", nullable = false)
    private Integer id;

    @Column(name = "strc_cod", nullable = false, length = 20)
    private String strcCod;

    @Column(name = "strc_des", length = 100)
    private String strcDes;

    @Column(name = "strc_statut", length = 20)
    private String strcStatut;

    @Column(name = "strc_aff")
    private Integer strcAff;

    @Column(name = "strc_datstat")
    private LocalDate strcDatstat;

    @Column(name = "strc_abrdes", length = 50)
    private String strcAbrdes;

}