package com.shop.augment_fashion.models;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="TBL_CART")
public class CartModel {

    @EmbeddedId
    @Getter @Setter
    private CartModelPK id;

    @Setter @Getter @Column(name="NQUANTITY")
    private int nquantity;

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
