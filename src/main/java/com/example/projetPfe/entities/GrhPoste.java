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
@Table(name = "grh_postes")
public class GrhPoste {
    @Id
    @ColumnDefault("nextval('grh_postes_pste_uid_seq')")
    @Column(name = "pste_uid", nullable = false)
    private Integer id;

    @Column(name = "pste_cod", nullable = false, length = 20)
    private String psteCod;

    @Column(name = "pste_des", length = 100)
    private String psteDes;

    @Column(name = "pste_obs", length = Integer.MAX_VALUE)
    private String psteObs;

    @Column(name = "pste_ord", length = 10)
    private String psteOrd;

    @Column(name = "pste_agemin")
    private Integer psteAgemin;

    @Column(name = "pste_agemax")
    private Integer psteAgemax;

    @Column(name = "pste_duress")
    private Integer psteDuress;

    @Column(name = "pste_activite", length = 20)
    private String psteActivite;

    @Column(name = "pste_ageret")
    private Integer psteAgeret;

    @Column(name = "pste_ageserret")
    private Integer psteAgeserret;

    @Column(name = "pste_ageretant")
    private Integer psteAgeretant;

    @Column(name = "pste_ageserant")
    private Integer psteAgeserant;

    @Column(name = "pste_duree")
    private Integer psteDuree;

}