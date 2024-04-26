package com.shop.augment_fashion.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="TBL_SHOPPING_CLOTHES")
public class Shopping_ClothesModel {
    
    @Setter @Getter @Column(name="nid_shopping")
    private int nid_shopping;

    @Setter @Getter @Column(name="nid_clothes")
    private int nid_clothes;

    @Setter @Getter @Column(name="nquantity")
    private int nquantity;

    @Setter @Getter @Column(name="famount")
    private float famount;
}
