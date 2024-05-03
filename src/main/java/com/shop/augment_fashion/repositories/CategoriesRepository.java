package com.shop.augment_fashion.repositories;

import java.util.List;

import com.shop.augment_fashion.models.CategoriesModel;

public interface CartRepository{
    void addCategory(CategoriesModel category);

    List<CategoriesModel> obtainCategories(int nid_clothes);

    void updateCataegory(int nid_clothes, string ccategory);

    void deleteCategory(int nid_clothes, string ccategory);
}