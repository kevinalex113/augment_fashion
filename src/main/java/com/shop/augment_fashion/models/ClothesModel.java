package com.shop.augment_fashion.models;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="TBL_CLOTHES")
public class ClothesModel {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Setter @Getter @Column(name="NID_CLOTHES")
    private int nid_clothes;

    @Setter @Getter @Column(name="CIMAGE")
    private String cimage;

    @Setter @Getter @Column(name="CDESCRIPTION")
    private String cdescription;

    @Setter @Getter @Column(name="CMATERIAL")
    private String cmaterial;

    @Setter @Getter @Column(name="CCOLOR")
    private String ccolor;

    @Setter @Getter @Column(name="CTYPE_CLOTHES")
    private String ctype_clothes;

    @Setter @Getter @Column(name="CSIZE")
    private String csize;

    @Setter @Getter @Column(name="FPRICE")
    private float fprice;

    @Setter @Getter @Column(name="NSTOCK")
    private int nstock;

    @Setter @Getter @Column(name="BENABLE")
    private Boolean benable;

    @Setter @Getter @Column(name="DREGISTRATION_DATE")
    @CreationTimestamp
    private LocalDateTime dregistration_date;
    
    @Setter @Getter @Column(name="DCANCELLATION_DATE")
    private LocalDateTime dcancellation_date;

}
