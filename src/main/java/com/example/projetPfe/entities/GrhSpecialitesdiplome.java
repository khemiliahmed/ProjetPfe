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
@Table(name = "grh_specialitesdiplomes")
public class GrhSpecialitesdiplome {
    @Id
    @ColumnDefault("nextval('grh_specialitesdiplomes_sdpl_uid_seq')")
    @Column(name = "sdpl_uid", nullable = false)
    private Integer id;

    @Column(name = "sdpl_cod", nullable = false, length = 20)
    private String sdplCod;

    @Column(name = "sdpl_des", length = 100)
    private String sdplDes;

}