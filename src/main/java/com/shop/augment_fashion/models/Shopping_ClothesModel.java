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
@Table(name="TBL_SHOPPING_CLOTHES")
public class Shopping_ClothesModel {
    
    @EmbeddedId
    @Setter @Getter
    private ShopppingClothesPK id;

    @Setter @Getter @Column(name="nquantity")
    private int nquantity;

    @Setter @Getter @Column(name="famount")
    private float famount;
    
    @Setter @Getter @Column(name="BENABLE")
    private Boolean benable;

    @Setter @Getter @Column(name="DREGISTRATION_DATE")
    @CreationTimestamp
    private LocalDateTime dregistration_date;
    
    @Setter @Getter @Column(name="DCANCELLATION_DATE")
    private LocalDateTime dcancellation_date;
}
