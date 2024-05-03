package com.shop.augment_fashion.repositories;

import java.util.List;

import com.shop.augment_fashion.models.Shopping_ClothesModel;

public interface Shopping_ClothesRepository {
    void addShopping_Clothes(String newShopping_Clothes);

    List<Shopping_ClothesModel> obtainClothes(int nid_Shopping);

    void updateShopping_Clothes(String updClothes);

    void deleteShoppingClothes(String delClothes);
}
