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
@Table(name = "grh_groupes")
public class GrhGroupe {
    @Id
    @ColumnDefault("nextval('grh_groupes_grpe_uid_seq')")
    @Column(name = "grpe_uid", nullable = false)
    private Integer id;

    @Column(name = "grpe_cod", nullable = false, length = 20)
    private String grpeCod;

    @Column(name = "grpe_des", length = 100)
    private String grpeDes;

    @Column(name = "grpe_dur")
    private Integer grpeDur;

}