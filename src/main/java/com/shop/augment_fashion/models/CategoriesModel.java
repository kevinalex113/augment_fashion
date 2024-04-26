package com.shop.augment_fashion.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="TBL_CATEGORIES")
public class CategoriesModel {
    @Setter @Getter @Column(name="NID_CLOTHES")
    private int nid_clothes;

    @Setter @Getter @Column(name="CCATEGORY")
    private String ccategory;

}
