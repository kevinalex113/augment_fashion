package com.shop.augment_fashion.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
public class CartModelPK {
    @Setter @Getter @Column(name="NID_USER")
    private int nid_user;

    @Setter @Getter @Column(name="NID_CLOTHES")
    private int nid_clothes;
}
