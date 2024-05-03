package com.shop.augment_fashion.repositories;

import java.util.List;

import com.shop.augment_fashion.models.CartModel;

public interface CartRepository{
    void addCart(CartModel cart);

    List<CartModel> obtainItems(int nid_user);

    void updateItem(int nid_user, int nid_clothes);

    void deleteItem(int nid_user, int nid_clothes);
}