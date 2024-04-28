package com.shop.augment_fashion.user_controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.shop.augment_fashion.models.UserModel;

@RestController
public class UserController {

    @GetMapping(value = "user/{nid_user}")
    public UserModel ObtainUser(@PathVariable int nid_user){
        return null;
    }

}
