package com.shop.augment_fashion.repositories;

import java.util.List;

import org.json.JSONObject;

import com.shop.augment_fashion.models.UserModel;


public interface UserRepository {
    List<UserModel> getUsers();

    UserModel getUser(int nid_user);

    void delUser(int nid_user);

    void newUser(JSONObject newUser, int nid_address);

    void updUser(String updaUser);
}
