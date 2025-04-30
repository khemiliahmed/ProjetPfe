package com.example.projetPfe.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "grh_infophysiqueemp")
public class GrhInfophysiqueemp {
    @Id
    @ColumnDefault("nextval('grh_infophysiqueemp_ifpe_uid_seq')")
    @Column(name = "ifpe_uid", nullable = false)
    private Integer id;

    @Column(name = "ifpe_dateff")
    private LocalDate ifpeDateff;

    @Column(name = "ifpe_mensuration")
    private Integer ifpeMensuration;

    @Column(name = "ifpe_taille")
    private Integer ifpeTaille;

    @Column(name = "ifpe_poid")
    private Integer ifpePoid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "empy_uid")
    private GrhEmploye empyUid;

}