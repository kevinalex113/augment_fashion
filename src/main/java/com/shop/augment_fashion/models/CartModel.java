package com.shop.augment_fashion.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="TBL_CART")
public class CartModel {
    private int nid_user;
    private int nid_clothes;
    private int nquantity;
    private float famount;
}
