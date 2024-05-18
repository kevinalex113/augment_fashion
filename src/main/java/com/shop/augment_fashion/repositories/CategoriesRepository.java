package com.shop.augment_fashion.repositories;

import org.json.JSONArray;
import org.json.JSONObject;

//import com.shop.augment_fashion.models.CategoriesModel;

public interface CategoriesRepository{
    JSONObject addCategory(JSONArray lstcategories, int nid_clothes, JSONObject jsonResponse);

    /*List<CategoriesModel> obtainCategories(int nid_clothes);

    void updateCataegory(String updCategory);

    void deleteCategory(String delCategory);*/
}