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
@Table(name = "grh_fonctions")
public class GrhFonction {
    @Id
    @ColumnDefault("nextval('grh_fonctions_fctn_uid_seq')")
    @Column(name = "fctn_uid", nullable = false)
    private Integer id;

    @Column(name = "fctn_cod", nullable = false, length = 20)
    private String fctnCod;

    @Column(name = "fctn_des", length = 100)
    private String fctnDes;

    @Column(name = "fctn_obs", length = Integer.MAX_VALUE)
    private String fctnObs;

    @Column(name = "fctn_ord", length = 10)
    private String fctnOrd;

    @Column(name = "fctn_typ", length = 20)
    private String fctnTyp;

}