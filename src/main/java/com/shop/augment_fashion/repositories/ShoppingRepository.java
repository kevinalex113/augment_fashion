package com.shop.augment_fashion.repositories;

import com.shop.augment_fashion.models.ShoppingModel;

public interface ShoppingRepository {
    void newShopping(String newShopping);

    ShoppingModel obtainShopping(int nid_Shopping);

    void updateShpping(String updShopping);

    void deleteShopping(String delShopping);
}
