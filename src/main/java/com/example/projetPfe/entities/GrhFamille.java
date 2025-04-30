package com.example.projetPfe.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "grh_familles")
public class GrhFamille {
    @Id
    @ColumnDefault("nextval('grh_familles_fami_uid_seq')")
    @Column(name = "fami_uid", nullable = false)
    private Integer id;

    @Column(name = "fami_nom", length = 50)
    private String famiNom;

    @Column(name = "fami_prn", length = 100)
    private String famiPrn;

    @Column(name = "fami_datnai")
    private LocalDate famiDatnai;

    @Column(name = "fami_datdcd")
    private LocalDate famiDatdcd;

    @Column(name = "fami_obs", length = Integer.MAX_VALUE)
    private String famiObs;

    @Column(name = "fami_datpec")
    private LocalDate famiDatpec;

    @Column(name = "fami_datfinalf")
    private LocalDate famiDatfinalf;

    @Column(name = "fami_datfinimp")
    private LocalDate famiDatfinimp;

    @Column(name = "fami_datfinasg")
    private LocalDate famiDatfinasg;

    @Column(name = "fami_hnd")
    private Integer famiHnd;

    @Column(name = "fami_photo")
    private byte[] famiPhoto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "empy_uidfam")
    private GrhEmploye empyUidfam;

    @Column(name = "fami_statut", length = 20)
    private String famiStatut;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tfam_uid")
    private GrhTypefami tfamUid;

}