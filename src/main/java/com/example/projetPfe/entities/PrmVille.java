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
@Table(name = "prm_villes")
public class PrmVille {
    @Id
    @ColumnDefault("nextval('prm_villes_vill_uid_seq')")
    @Column(name = "vill_uid", nullable = false)
    private Integer id;

    @Column(name = "vill_cod", nullable = false, length = 20)
    private String villCod;

    @Column(name = "vill_des", length = 100)
    private String villDes;

    @Column(name = "vill_cp", length = 10)
    private String villCp;

}