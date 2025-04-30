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
@Table(name = "grh_echelles")
public class GrhEchelle {
    @Id
    @ColumnDefault("nextval('grh_echelles_echl_uid_seq')")
    @Column(name = "echl_uid", nullable = false)
    private Integer id;

    @Column(name = "echl_cod", nullable = false, length = 20)
    private String echlCod;

    @Column(name = "echl_des", length = 100)
    private String echlDes;

    @Column(name = "echl_obs", length = Integer.MAX_VALUE)
    private String echlObs;

    @Column(name = "echl_ord", length = 10)
    private String echlOrd;

}