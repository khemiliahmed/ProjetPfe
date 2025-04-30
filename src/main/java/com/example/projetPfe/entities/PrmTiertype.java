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
@Table(name = "prm_tiertype")
public class PrmTiertype {
    @Id
    @ColumnDefault("nextval('prm_tiertype_ptit_uid_seq')")
    @Column(name = "ptit_uid", nullable = false)
    private Integer id;

    @Column(name = "ptit_cod", nullable = false, length = 20)
    private String ptitCod;

    @Column(name = "ptit_des", length = 100)
    private String ptitDes;

}