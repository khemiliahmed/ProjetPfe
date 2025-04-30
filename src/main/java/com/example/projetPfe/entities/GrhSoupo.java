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
@Table(name = "grh_soupos")
public class GrhSoupo {
    @Id
    @ColumnDefault("nextval('grh_soupos_spos_uid_seq')")
    @Column(name = "spos_uid", nullable = false)
    private Integer id;

    @Column(name = "spos_cod", nullable = false, length = 20)
    private String sposCod;

    @Column(name = "spos_des", length = 100)
    private String sposDes;

}