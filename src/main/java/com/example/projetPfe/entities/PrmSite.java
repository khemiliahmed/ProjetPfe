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
@Table(name = "prm_sites")
public class PrmSite {
    @Id
    @ColumnDefault("nextval('prm_sites_site_uid_seq')")
    @Column(name = "site_uid", nullable = false)
    private Integer id;

    @Column(name = "site_cod", nullable = false, length = 20)
    private String siteCod;

    @Column(name = "site_des", length = 100)
    private String siteDes;

    @Column(name = "site_nbr_etage", length = 10)
    private String siteNbrEtage;

    @Column(name = "site_surface")
    private Integer siteSurface;

}