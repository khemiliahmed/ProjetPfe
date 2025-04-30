package com.example.projetPfe.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "grh_affempy")
public class GrhAffempy {
    @Id
    @ColumnDefault("nextval('grh_affempy_afey_uid_seq')")
    @Column(name = "afey_uid", nullable = false)
    private Integer id;

    @Column(name = "afey_num", length = 20)
    private String afeyNum;

    @Column(name = "afey_datdeb")
    private LocalDate afeyDatdeb;

    @Column(name = "afey_datfin")
    private LocalDate afeyDatfin;

    @Column(name = "afey_obs", length = Integer.MAX_VALUE)
    private String afeyObs;

    @Column(name = "afey_mnt")
    private Integer afeyMnt;

    @Column(name = "afey_nbr")
    private Integer afeyNbr;

    @Column(name = "afey_datdem")
    private LocalDate afeyDatdem;

    @Column(name = "afey_cnj")
    private Integer afeyCnj;

    @Column(name = "afey_statut", length = 20)
    private String afeyStatut;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "empy_uid")
    private GrhEmploye empyUid;

}