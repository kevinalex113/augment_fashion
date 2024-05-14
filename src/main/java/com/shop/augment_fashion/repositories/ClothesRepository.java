package com.shop.augment_fashion.repositories;

import java.util.List;

import com.shop.augment_fashion.models.ClothesModel;

public interface ClothesRepository{
    String addClothes(JSONObject newClothes, JSONObject jsonResponse);

    List<ClothesModel> obtainClothes(int nid_clothes);

    void updateClothes(int nid_clothes);

    void deleteClothes(int nid_clothes);
}