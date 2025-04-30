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
@Table(name = "grh_typeposte")
public class GrhTypeposte {
    @Id
    @ColumnDefault("nextval('grh_typeposte_tpst_uid_seq')")
    @Column(name = "tpst_uid", nullable = false)
    private Integer id;

    @Column(name = "tpst_cod", nullable = false, length = 20)
    private String tpstCod;

    @Column(name = "tpst_des", length = 100)
    private String tpstDes;

    @Column(name = "tpst_ord")
    private Integer tpstOrd;

}