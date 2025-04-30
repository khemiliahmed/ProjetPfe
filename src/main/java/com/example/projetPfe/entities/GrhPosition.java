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
@Table(name = "grh_positions")
public class GrhPosition {
    @Id
    @ColumnDefault("nextval('grh_positions_pstn_uid_seq')")
    @Column(name = "pstn_uid", nullable = false)
    private Integer id;

    @Column(name = "pstn_cod", nullable = false, length = 20)
    private String pstnCod;

    @Column(name = "pstn_des", length = 100)
    private String pstnDes;

    @Column(name = "pstn_type", length = 20)
    private String pstnType;

}