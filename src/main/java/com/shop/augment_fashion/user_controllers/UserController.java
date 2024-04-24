package com.shop.augment_fashion.user_controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.shop.augment_fashion.models.UserModel;

@RestController
public class UserController {

    @GetMapping(value = "user/{nid_user}")
    public UserModel ObtainUser(@PathVariable int nid_user){
        UserModel user =new UserModel();
        user.setNid_user(nid_user);
        user.setCfirst_name("Luis Eduardo");
        user.setCsurnames("Bautista Gaona");
        user.setCnickname("minimoy");
        user.setCemail("eduardobautista9916@gmail.com");
        user.setCpassword("1234567890");
        user.setNrole(2);
        user.setNid_Address(10);
        return user;
    }

}
