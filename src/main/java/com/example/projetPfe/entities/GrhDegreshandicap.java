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
@Table(name = "grh_degreshandicaps")
public class GrhDegreshandicap {
    @Id
    @ColumnDefault("nextval('grh_degreshandicaps_dhdc_uid_seq')")
    @Column(name = "dhdc_uid", nullable = false)
    private Integer id;

    @Column(name = "dhdc_cod", nullable = false, length = 20)
    private String dhdcCod;

    @Column(name = "dhdc_des", length = 100)
    private String dhdcDes;

    @Column(name = "dhdc_dur")
    private Integer dhdcDur;

    @Column(name = "dhdc_tauinc")
    private Integer dhdcTauinc;

}