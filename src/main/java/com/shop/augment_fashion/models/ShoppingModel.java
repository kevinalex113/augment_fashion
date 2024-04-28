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
@Table(name="TBL_SHOPPING")
public class ShoppingModel {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Setter @Getter @Column(name="NID_SHOPPING")
    private int nid_shopping;

    @Setter @Getter @Column(name="NID_USER")
    private int nid_user;

    @Setter @Getter @Column(name="FAMOUNT")
    private float famount;
    
    @Setter @Getter @Column(name="BENABLE")
    private Boolean benable;

    @Setter @Getter @Column(name="DREGISTRATION_DATE")
    @CreationTimestamp
    private LocalDateTime dregistration_date;
    
    @Setter @Getter @Column(name="DCANCELLATION_DATE")
    private LocalDateTime dcancellation_date;
}
