package com.shop.augment_fashion.repositories;

import java.util.List;

import com.shop.augment_fashion.models.UserModel;


public interface UserRepository {
    List<UserModel> getUsers();

    UserModel getUser(int nid_user);

    void delUser(int nid_user);

    void newUser(String newUser);

    void updUser(String updaUser);
}
