package com.example.projetPfe.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "grh_enfant")
public class GrhEnfant {
    @Id
    @ColumnDefault("nextval('grh_enfant_enfn_uid_seq')")
    @Column(name = "enfn_uid", nullable = false)
    private Integer id;

    @Column(name = "enfn_rng")
    private Integer enfnRng;

    @Column(name = "enfn_prn", length = 100)
    private String enfnPrn;

    @Column(name = "enfn_datnai")
    private LocalDate enfnDatnai;

    @Column(name = "enfn_gnr", length = 1)
    private String enfnGnr;

    @Column(name = "enfn_datdcd")
    private LocalDate enfnDatdcd;

    @Column(name = "enfn_datfinimp")
    private LocalDate enfnDatfinimp;

    @Column(name = "enfn_obs", length = Integer.MAX_VALUE)
    private String enfnObs;

    @Column(name = "enfn_datpec")
    private LocalDate enfnDatpec;

    @Column(name = "enfn_datfinalf")
    private LocalDate enfnDatfinalf;

    @Column(name = "enfn_hnd")
    private Integer enfnHnd;

    @Column(name = "enfn_nonbrs")
    private Integer enfnNonbrs;

    @Column(name = "enfn_photo")
    private byte[] enfnPhoto;

    @Column(name = "enfn_statut", length = 20)
    private String enfnStatut;

    @Column(name = "enfn_alcfam")
    private Integer enfnAlcfam;

    @Column(name = "enfn_nom", length = 50)
    private String enfnNom;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fami_uid")
    private GrhFamille famiUid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nvet_uid")
    private GrhNiveauxetude nvetUid;

}