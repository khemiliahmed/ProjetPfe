package com.example.projetPfe.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "grh_docemp")
public class GrhDocemp {
    @Id
    @ColumnDefault("nextval('grh_docemp_doce_uid_seq')")
    @Column(name = "doce_uid", nullable = false)
    private Integer id;

    @Column(name = "doce_nom", length = 100)
    private String doceNom;

    @Column(name = "doce_type", length = 50)
    private String doceType;

    @Column(name = "doce_date")
    private LocalDate doceDate;

    @Column(name = "doce_fichier")
    private byte[] doceFichier;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "empy_uid")
    private GrhEmploye empyUid;

}