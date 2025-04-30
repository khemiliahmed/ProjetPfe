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
@Table(name = "grh_echelons")
public class GrhEchelon {
    @Id
    @ColumnDefault("nextval('grh_echelons_echn_uid_seq')")
    @Column(name = "echn_uid", nullable = false)
    private Integer id;

    @Column(name = "echn_cod", nullable = false, length = 20)
    private String echnCod;

    @Column(name = "echn_des", length = 100)
    private String echnDes;

    @Column(name = "echn_obs", length = Integer.MAX_VALUE)
    private String echnObs;

    @Column(name = "echn_ord", length = 10)
    private String echnOrd;

}