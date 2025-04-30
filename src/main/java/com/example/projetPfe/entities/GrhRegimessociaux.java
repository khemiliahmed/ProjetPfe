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
@Table(name = "grh_regimessociaux")
public class GrhRegimessociaux {
    @Id
    @ColumnDefault("nextval('grh_regimessociaux_rscs_uid_seq')")
    @Column(name = "rscs_uid", nullable = false)
    private Integer id;

    @Column(name = "rscs_cod", nullable = false, length = 20)
    private String rscsCod;

    @Column(name = "rscs_des", length = 100)
    private String rscsDes;

    @Column(name = "rscs_obs", length = Integer.MAX_VALUE)
    private String rscsObs;

    @Column(name = "rscs_ord", length = 10)
    private String rscsOrd;

    @Column(name = "rscs_dur")
    private Integer rscsDur;

}