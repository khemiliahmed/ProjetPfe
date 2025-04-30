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
@Table(name = "grh_grillessalaires")
public class GrhGrillessalaire {
    @Id
    @ColumnDefault("nextval('grh_grillessalaires_gslr_uid_seq')")
    @Column(name = "gslr_uid", nullable = false)
    private Integer id;

    @Column(name = "gslr_cod", nullable = false, length = 20)
    private String gslrCod;

    @Column(name = "gslr_des", length = 100)
    private String gslrDes;

}