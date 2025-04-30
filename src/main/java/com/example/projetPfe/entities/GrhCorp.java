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
@Table(name = "grh_corps")
public class GrhCorp {
    @Id
    @ColumnDefault("nextval('grh_corps_crps_uid_seq')")
    @Column(name = "crps_uid", nullable = false)
    private Integer id;

    @Column(name = "crps_cod", nullable = false, length = 20)
    private String crpsCod;

    @Column(name = "crps_des", length = 100)
    private String crpsDes;

    @Column(name = "crps_agetrv")
    private Integer crpsAgetrv;

    @Column(name = "crps_duress")
    private Integer crpsDuress;

    @Column(name = "crps_rtratc")
    private Integer crpsRtratc;

    @Column(name = "crps_rtrnml")
    private Integer crpsRtrnml;

    @Column(name = "crps_obs", length = Integer.MAX_VALUE)
    private String crpsObs;

    @Column(name = "crps_uidper")
    private Integer crpsUidper;

    @Column(name = "crps_agemax")
    private Integer crpsAgemax;

    @Column(name = "crps_ageserret")
    private Integer crpsAgeserret;

    @Column(name = "crps_ageserant")
    private Integer crpsAgeserant;

}