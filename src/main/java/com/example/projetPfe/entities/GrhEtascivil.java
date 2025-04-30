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
@Table(name = "grh_etascivils")
public class GrhEtascivil {
    @Id
    @ColumnDefault("nextval('grh_etascivils_etcv_uid_seq')")
    @Column(name = "etcv_uid", nullable = false)
    private Integer id;

    @Column(name = "etcv_cod", nullable = false, length = 20)
    private String etcvCod;

    @Column(name = "etcv_des", length = 100)
    private String etcvDes;

}