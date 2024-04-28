package com.shop.augment_fashion.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
public class ShopppingClothesPK {
    @Setter @Getter @Column(name="nid_shopping")
    private int nid_shopping;

    @Setter @Getter @Column(name="nid_clothes")
    private int nid_clothes;
}
