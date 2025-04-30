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
@Table(name = "grh_grades")
public class GrhGrade {
    @Id
    @ColumnDefault("nextval('grh_grades_grde_uid_seq')")
    @Column(name = "grde_uid", nullable = false)
    private Integer id;

    @Column(name = "grde_cod", nullable = false, length = 20)
    private String grdeCod;

    @Column(name = "grde_des", length = 100)
    private String grdeDes;

    @Column(name = "grde_obs", length = Integer.MAX_VALUE)
    private String grdeObs;

    @Column(name = "grde_ord", length = 10)
    private String grdeOrd;

    @Column(name = "grde_duress")
    private Integer grdeDuress;

    @Column(name = "grde_ageret")
    private Integer grdeAgeret;

}