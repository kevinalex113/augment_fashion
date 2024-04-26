package com.shop.augment_fashion.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="TBL_CART")
public class CartModel {

    @Setter @Getter @Column(name="NID_USER")
    private int nid_user;

    @Setter @Getter @Column(name="NID_CLOTHES")
    private int nid_clothes;

    @Setter @Getter @Column(name="NQUANTITY")
    private int nquantity;

    @Setter @Getter @Column(name="FAMOUNT")
    private float famount;
}
