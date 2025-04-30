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
@Table(name = "grh_typefami")
public class GrhTypefami {
    @Id
    @ColumnDefault("nextval('grh_typefami_tfam_uid_seq')")
    @Column(name = "tfam_uid", nullable = false)
    private Integer id;

    @Column(name = "tfam_cod", nullable = false, length = 20)
    private String tfamCod;

    @Column(name = "tfam_des", length = 100)
    private String tfamDes;

    @Column(name = "tfam_nbr")
    private Integer tfamNbr;

}