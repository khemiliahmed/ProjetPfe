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
@Table(name = "prm_civilites")
public class PrmCivilite {
    @Id
    @ColumnDefault("nextval('prm_civilites_cvlt_uid_seq')")
    @Column(name = "cvlt_uid", nullable = false)
    private Integer id;

    @Column(name = "cvlt_cod", nullable = false, length = 20)
    private String cvltCod;

    @Column(name = "cvlt_des", length = 100)
    private String cvltDes;

}