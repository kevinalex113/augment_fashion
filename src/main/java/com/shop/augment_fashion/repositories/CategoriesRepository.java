package com.shop.augment_fashion.repositories;

import java.util.List;

import com.shop.augment_fashion.models.CategoriesModel;

public interface CategoriesRepository{
    void addCategory(String newCategory);

    List<CategoriesModel> obtainCategories(int nid_clothes);

    void updateCataegory(String updCategory);

    void deleteCategory(String delCategory);
}