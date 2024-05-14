package com.shop.augment_fashion.repositories;

import java.util.List;

import org.json.JSONObject;

import com.shop.augment_fashion.models.UserModel;


public interface UserRepository {
    List<UserModel> getUsers();

    JSONObject getUser(JSONObject jsonUser, JSONObject jsonResponse);

    void delUser(int nid_user);

    JSONObject newUser(JSONObject newUser, int nid_address, JSONObject jsonResponse);

    void updUser(String updaUser);
}
