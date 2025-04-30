package com.example.projetPfe.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "grh_regimestravail")
public class GrhRegimestravail {
    @Id
    @ColumnDefault("nextval('grh_regimestravail_rtrv_uid_seq')")
    @Column(name = "rtrv_uid", nullable = false)
    private Integer id;

    @Column(name = "rtrv_cod", nullable = false, length = 20)
    private String rtrvCod;

    @Column(name = "rtrv_des", length = 100)
    private String rtrvDes;

    @Column(name = "rtrv_obs", length = Integer.MAX_VALUE)
    private String rtrvObs;

    @Column(name = "rtrv_ord", length = 10)
    private String rtrvOrd;

    @Column(name = "rtrv_nbrjrsmoi")
    private Integer rtrvNbrjrsmoi;

    @Column(name = "rtrv_nbrhremoi")
    private Integer rtrvNbrhremoi;

    @Column(name = "rtrv_nbrhresmn")
    private Integer rtrvNbrhresmn;

    @Column(name = "rtrv_lun")
    private Integer rtrvLun;

    @Column(name = "rtrv_mar")
    private Integer rtrvMar;

    @Column(name = "rtrv_mer")
    private Integer rtrvMer;

    @Column(name = "rtrv_jeu")
    private Integer rtrvJeu;

    @Column(name = "rtrv_ven")
    private Integer rtrvVen;

    @Column(name = "rtrv_sam")
    private Integer rtrvSam;

    @Column(name = "rtrv_dim")
    private Integer rtrvDim;

}