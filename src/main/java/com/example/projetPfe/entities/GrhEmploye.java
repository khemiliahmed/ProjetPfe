package com.example.projetPfe.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "grh_employe")
public class GrhEmploye {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empy_uid", nullable = false)
    private Integer id;

    @Column(name = "empy_cod", length = 20)
    private String empyCod;

    @Column(name = "empy_codpco", length = 20)
    private String empyCodpco;

    @Column(name = "empy_nom_in1", length = 50)
    private String empyNomIn1;

    @Column(name = "empy_prn_in1", length = 100)
    private String empyPrnIn1;

    @Column(name = "empy_nom_ip_in1", length = 50)
    private String empyNomIpIn1;

    @Column(name = "empy_nom_op_in1", length = 100)
    private String empyNomOpIn1;

    @Column(name = "empy_gnr")
    private Integer empyGnr;

    @Column(name = "empy_datin1")
    private LocalDate empyDatin1;

    @Column(name = "empy_numcin", length = 20)
    private String empyNumcin;

    @Column(name = "empy_datcn")
    private LocalDate empyDatcn;

    @Column(name = "empy_atp")
    private Integer empyAtp;

    @Column(name = "empy_adr_in1", length = 1000)
    private String empyAdrIn1;

    @Column(name = "empy_tel", length = 15)
    private String empyTel;

    @Column(name = "empy_bmail", length = 100)
    private String empyBmail;

    @Column(name = "empy_datent")
    private LocalDate empyDatent;

    @Column(name = "empy_datrec")
    private LocalDate empyDatrec;

    @Column(name = "empy_dattit")
    private LocalDate empyDattit;

    @Column(name = "empy_datsit")
    private LocalDate empyDatsit;

    @Column(name = "empy_datstr")
    private LocalDate empyDatstr;

    @Column(name = "empy_datdbpds")
    private LocalDate empyDatdbpds;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rscs_uid")
    private GrhRegimessociaux rscsUid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ntrl_uid")
    private PrmNationalite ntrlUid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pstn_uid")
    private GrhPosition pstnUid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pdls_uid")
    private PrmDetailsListe pdlsUid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ptit_uid")
    private PrmTiertype ptitUid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "crps_uid")
    private GrhCorp crpsUid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pste_uid")
    private GrhPoste psteUid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gslr_uid")
    private GrhGrillessalaire gslrUid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nthn_uid")
    private GrhNaturehandicap nthnUid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "spos_uid")
    private GrhSoupo sposUid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dhdc_uid")
    private GrhDegreshandicap dhdcUid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "echl_uid")
    private GrhEchelle echlUid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "echn_uid")
    private GrhEchelon echnUid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "grpe_uid")
    private GrhGroupe grpeUid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "site_uid")
    private PrmSite siteUid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "strc_uid")
    private PrmStucture strcUid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fctn_uid")
    private GrhFonction fctnUid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vill_uid")
    private PrmVille villUid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sdpl_uid")
    private GrhSpecialitesdiplome sdplUid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ctgr_uid")
    private GrhCategory ctgrUid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rtrv_uid")
    private GrhRegimestravail rtrvUid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "grde_uid")
    private GrhGrade grdeUid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cvlt_uid")
    private PrmCivilite cvltUid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "etcv_uid")
    private PrmEtatscivil etcvUid;

}