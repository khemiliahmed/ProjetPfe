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
@Table(name = "grh_natfonctions")
public class GrhNatfonction {
    @Id
    @ColumnDefault("nextval('grh_natfonctions_nfct_uid_seq')")
    @Column(name = "nfct_uid", nullable = false)
    private Integer id;

    @Column(name = "nfct_cod", nullable = false, length = 20)
    private String nfctCod;

    @Column(name = "nfct_des_ln1", length = 100)
    private String nfctDesLn1;

    @Column(name = "nfct_obs_ln1", length = Integer.MAX_VALUE)
    private String nfctObsLn1;

}