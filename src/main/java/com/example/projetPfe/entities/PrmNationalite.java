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
@Table(name = "prm_nationalites")
public class PrmNationalite {
    @Id
    @ColumnDefault("nextval('prm_nationalites_ntnl_uid_seq')")
    @Column(name = "ntnl_uid", nullable = false)
    private Integer id;

    @Column(name = "ntnl_cod", nullable = false, length = 20)
    private String ntnlCod;

    @Column(name = "ntnl_des", length = 100)
    private String ntnlDes;

}