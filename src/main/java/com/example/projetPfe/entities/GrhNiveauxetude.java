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
@Table(name = "grh_niveauxetudes")
public class GrhNiveauxetude {
    @Id
    @ColumnDefault("nextval('grh_niveauxetudes_nvet_uid_seq')")
    @Column(name = "nvet_uid", nullable = false)
    private Integer id;

    @Column(name = "nvet_cod", nullable = false, length = 20)
    private String nvetCod;

    @Column(name = "nvet_des", length = 100)
    private String nvetDes;

    @Column(name = "nvet_mntaid")
    private Integer nvetMntaid;

}