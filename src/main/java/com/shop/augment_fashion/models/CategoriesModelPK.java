package com.shop.augment_fashion.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
public class CategoriesModelPK {
    @Setter @Getter @Column(name="NID_CLOTHES")
    private int nid_clothes;

    @Setter @Getter @Column(name="CCATEGORY")
    private String ccategory;
}
