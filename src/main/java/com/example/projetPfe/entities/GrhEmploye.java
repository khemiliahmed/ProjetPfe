package com.example.projetPfe.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "grh_employe")
public class GrhEmploye {
    @Id
    @ColumnDefault("nextval('grh_employe_empy_uid_seq')")
    @Column(name = "empy_uid", nullable = false)
    private Integer id;

    @Column(name = "empy_cod", length = 20)
    private String empyCod;

    @Column(name = "empy_codpco", length = 20)
    private String empyCodpco;

    @Column(name = "empy_nom", length = 50)
    private String empyNom;

    @Column(name = "empy_prn", length = 100)
    private String empyPrn;

    @Column(name = "empy_nomjnf", length = 50)
    private String empyNomjnf;

    @Column(name = "empy_nomcmp", length = 50)
    private String empyNomcmp;

    @Column(name = "empy_gnr")
    private Integer empyGnr;

    @Column(name = "empy_datnai")
    private LocalDate empyDatnai;

    @Column(name = "empy_numcin", length = 20)
    private String empyNumcin;

    @Column(name = "empy_datcin")
    private LocalDate empyDatcin;

    @Column(name = "empy_atf")
    private Integer empyAtf;

    @Column(name = "empy_adr", length = Integer.MAX_VALUE)
    private String empyAdr;

    @Column(name = "empy_tel", length = 15)
    private String empyTel;

    @Column(name = "empy_email", length = 100)
    private String empyEmail;

    @Column(name = "empy_photo")
    private byte[] empyPhoto;

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

    @Column(name = "empy_datdebpos")
    private LocalDate empyDatdebpos;

    @Column(name = "empy_datfinpos")
    private LocalDate empyDatfinpos;

    @Column(name = "empy_datdebspo")
    private LocalDate empyDatdebspo;

    @Column(name = "empy_findebspo")
    private LocalDate empyFindebspo;

    @Column(name = "empy_codpcd", length = 20)
    private String empyCodpcd;

    @Column(name = "empy_typdtc")
    private Integer empyTypdtc;

    @Column(name = "empy_datdebrgt")
    private LocalDate empyDatdebrgt;

    @Column(name = "empy_datfinrgt")
    private LocalDate empyDatfinrgt;

    @Column(name = "empy_typctr")
    private Integer empyTypctr;

    @Column(name = "empy_badge", length = 20)
    private String empyBadge;

    @Column(name = "empy_datsfm")
    private LocalDate empyDatsfm;

    @Column(name = "empy_nbrenf")
    private Integer empyNbrenf;

    @Column(name = "empy_nbrenfses")
    private Integer empyNbrenfses;

    @Column(name = "empy_nbrenfimp")
    private Integer empyNbrenfimp;

    @Column(name = "empy_nbrenfasg")
    private Integer empyNbrenfasg;

    @Column(name = "empy_chffam")
    private Integer empyChffam;

    @Column(name = "empy_slrunq")
    private Integer empySlrunq;

    @Column(name = "empy_alcfam")
    private Integer empyAlcfam;

    @Column(name = "empy_numses")
    private Integer empyNumses;

    @Column(name = "empy_datses")
    private LocalDate empyDatses;

    @Column(name = "empy_numrss")
    private Integer empyNumrss;

    @Column(name = "empy_datdebrss")
    private LocalDate empyDatdebrss;

    @Column(name = "empy_datfinrss")
    private LocalDate empyDatfinrss;

    @Column(name = "empy_datdebhd")
    private LocalDate empyDatdebhd;

    @Column(name = "empy_datasgrp")
    private LocalDate empyDatasgrp;

    @Column(name = "empy_affasgcnj")
    private Integer empyAffasgcnj;

    @Column(name = "empy_numasg", length = 20)
    private String empyNumasg;

    @Column(name = "empy_mntassgrprtr")
    private Integer empyMntassgrprtr;

    @Column(name = "empy_datgrs")
    private LocalDate empyDatgrs;

    @Column(name = "empy_datcat")
    private LocalDate empyDatcat;

    @Column(name = "empy_datecl")
    private LocalDate empyDatecl;

    @Column(name = "empy_datecn")
    private LocalDate empyDatecn;

    @Column(name = "empy_datcrp")
    private LocalDate empyDatcrp;

    @Column(name = "empy_datgrd")
    private LocalDate empyDatgrd;

    @Column(name = "empy_datfiness")
    private LocalDate empyDatfiness;

    @Column(name = "empy_datgrdtit")
    private LocalDate empyDatgrdtit;

    @Column(name = "empy_datpst")
    private LocalDate empyDatpst;

    @Column(name = "empy_datpsttit")
    private LocalDate empyDatpsttit;

    @Column(name = "empy_datfct")
    private LocalDate empyDatfct;

    @Column(name = "empy_mntrdsimp")
    private Integer empyMntrdsimp;

    @Column(name = "empy_mntinv")
    private Integer empyMntinv;

    @Column(name = "empy_datdebinv")
    private LocalDate empyDatdebinv;

    @Column(name = "empy_datfininv")
    private LocalDate empyDatfininv;

    @Column(name = "pret_mntasv")
    private Integer pretMntasv;

    @Column(name = "empy_datdebasv")
    private LocalDate empyDatdebasv;

    @Column(name = "empy_datfinasv")
    private LocalDate empyDatfinasv;

    @Column(name = "empy_datdebexoimp")
    private LocalDate empyDatdebexoimp;

    @Column(name = "empy_datfinexoimp")
    private LocalDate empyDatfinexoimp;

    @Column(name = "empy_nbrpaircu")
    private Integer empyNbrpaircu;

    @Column(name = "empy_mnttpc")
    private Integer empyMnttpc;

    @Column(name = "empy_mntard")
    private Integer empyMntard;

    @Column(name = "empy_nbjddctit")
    private Integer empyNbjddctit;

    @Column(name = "empy_nbjddcgrs")
    private Integer empyNbjddcgrs;

    @Column(name = "empy_nbjddccat")
    private Integer empyNbjddccat;

    @Column(name = "empy_nbjddcecl")
    private Integer empyNbjddcecl;

    @Column(name = "empy_nbjddcecn")
    private Integer empyNbjddcecn;

    @Column(name = "empy_nbjddccrp")
    private Integer empyNbjddccrp;

    @Column(name = "empy_nbjddcgrd")
    private Integer empyNbjddcgrd;

    @Column(name = "empy_nbjddcfct")
    private Integer empyNbjddcfct;

    @Column(name = "empy_horgrs")
    private Integer empyHorgrs;

    @Column(name = "empy_chmlib01", length = 100)
    private String empyChmlib01;

    @Column(name = "empy_chmlib02", length = 100)
    private String empyChmlib02;

    @Column(name = "empy_chmlib03", length = 100)
    private String empyChmlib03;

    @Column(name = "empy_chmlib04", length = 100)
    private String empyChmlib04;

    @Column(name = "empy_chmlib05", length = 100)
    private String empyChmlib05;

    @Column(name = "empy_chmlib06", length = 100)
    private String empyChmlib06;

    @Column(name = "empy_chmlib07", length = 100)
    private String empyChmlib07;

    @Column(name = "empy_chmlib08", length = 100)
    private String empyChmlib08;

    @Column(name = "empy_chmlib09", length = 100)
    private String empyChmlib09;

    @Column(name = "empy_chmlib10", length = 100)
    private String empyChmlib10;

    @Column(name = "empy_obs", length = Integer.MAX_VALUE)
    private String empyObs;

    @Column(name = "empy_statut", length = 20)
    private String empyStatut;

    @Column(name = "empy_datfinasgrp")
    private LocalDate empyDatfinasgrp;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cvlt_uid")
    private PrmCivilite cvltUid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ntnl_uid")
    private PrmNationalite ntnlUid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pstn_uid")
    private GrhPosition pstnUid;

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
    @JoinColumn(name = "etcv_uid")
    private GrhEtascivil etcvUid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pdls_uid")
    private PrmDetailsListe pdlsUid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rscs_uid")
    private GrhRegimessociaux rscsUid;

}