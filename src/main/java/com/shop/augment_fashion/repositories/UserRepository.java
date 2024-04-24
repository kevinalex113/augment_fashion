package com.shop.augment_fashion.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shop.augment_fashion.models.UserModel;

@Repository
@Transactional
public class UserRepository implements UserInterface {

    @Override
    public List<UserModel> getUser() {
        return null;
    }

}
