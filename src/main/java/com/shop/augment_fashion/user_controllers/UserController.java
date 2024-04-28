package com.shop.augment_fashion.user_controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shop.augment_fashion.models.UserModel;
import com.shop.augment_fashion.repositories.UserRepository;

/**
 *
 * @author EduardoBautista
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository user;

    @RequestMapping(value = "/Users",method=RequestMethod.GET)
    public List<UserModel> ObtainUser(){
        return user.getUsers();
    }

}
