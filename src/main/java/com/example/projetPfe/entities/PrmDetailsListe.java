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
@Table(name = "prm_details_listes")
public class PrmDetailsListe {
    @Id
    @ColumnDefault("nextval('prm_details_listes_pdls_uid_seq')")
    @Column(name = "pdls_uid", nullable = false)
    private Integer id;

    @Column(name = "pdls_cod", nullable = false, length = 20)
    private String pdlsCod;

    @Column(name = "pdls_des", length = 100)
    private String pdlsDes;

}