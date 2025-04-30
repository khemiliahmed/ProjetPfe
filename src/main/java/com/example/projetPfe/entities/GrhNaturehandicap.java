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
@Table(name = "grh_naturehandicap")
public class GrhNaturehandicap {
    @Id
    @ColumnDefault("nextval('grh_naturehandicap_nthn_uid_seq')")
    @Column(name = "nthn_uid", nullable = false)
    private Integer id;

    @Column(name = "nthn_cod", nullable = false, length = 20)
    private String nthnCod;

    @Column(name = "nthn_des", length = 100)
    private String nthnDes;

}