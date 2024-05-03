package com.shop.augment_fashion.repositories;

import java.util.List;

import com.shop.augment_fashion.models.CartModel;

public interface CartRepository{
    void addCart(String newCart);

    List<CartModel> obtainItems(int nid_user);

    void updateItem(String newCart);

    void deleteItem(String delCart);
}