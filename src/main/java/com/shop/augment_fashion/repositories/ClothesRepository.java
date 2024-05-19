package com.shop.augment_fashion.repositories;

import org.json.JSONArray;
import org.json.JSONObject;

public interface ClothesRepository{
    JSONObject addClothes(JSONObject newClothes, JSONObject jsonResponse);

    JSONArray obtainClothes();
/*
    void updateClothes(int nid_clothes);

    void deleteClothes(int nid_clothes); */
}