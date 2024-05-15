package com.shop.augment_fashion.repositories;

import org.json.JSONObject;

public interface ClothesRepository{
    JSONObject addClothes(JSONObject newClothes, JSONObject jsonResponse);

/*    List<ClothesModel> obtainClothes(int nid_clothes);

    void updateClothes(int nid_clothes);

    void deleteClothes(int nid_clothes); */
}