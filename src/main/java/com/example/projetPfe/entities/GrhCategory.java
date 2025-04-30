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
@Table(name = "grh_categories")
public class GrhCategory {
    @Id
    @ColumnDefault("nextval('grh_categories_ctgr_uid_seq')")
    @Column(name = "ctgr_uid", nullable = false)
    private Integer id;

    @Column(name = "ctgr_cod", nullable = false, length = 20)
    private String ctgrCod;

    @Column(name = "ctgr_des", length = 100)
    private String ctgrDes;

    @Column(name = "ctgr_obs", length = Integer.MAX_VALUE)
    private String ctgrObs;

    @Column(name = "ctgr_ord", length = 10)
    private String ctgrOrd;

    @Column(name = "ctgr_duress")
    private Integer ctgrDuress;

    @Column(name = "ctgr_agemin")
    private Integer ctgrAgemin;

    @Column(name = "ctgr_agemax")
    private Integer ctgrAgemax;

    @Column(name = "ctgr_ageret")
    private Integer ctgrAgeret;

    @Column(name = "ctgr_ageserret")
    private Integer ctgrAgeserret;

    @Column(name = "ctgr_ageretant")
    private Integer ctgrAgeretant;

    @Column(name = "ctgr_ageserant")
    private Integer ctgrAgeserant;

}