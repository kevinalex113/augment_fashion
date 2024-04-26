package com.shop.augment_fashion.models;

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
}
