package com.shop.augment_fashion.user_controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
    public List<UserModel> getUsers(){
        return user.getUsers();
    }

    @RequestMapping(value = "/Users/{nid_user}",method=RequestMethod.GET)
    public UserModel getUser(@PathVariable int nid_user){
        return user.getUser(nid_user);
    }

    @RequestMapping(value = "/Users/{nid_user}",method=RequestMethod.DELETE)
    public void delUser(@PathVariable int nid_user){
        user.delUser(nid_user);
    }

    @RequestMapping(value = "/Users",method=RequestMethod.POST)
    public void insertUser(@RequestBody String newUser){
        user.newUser(newUser); 
    }

    @RequestMapping(value="/Users", method=RequestMethod.PUT)
    public void updateUser(@RequestBody String updaUser){
        user.updUser(updaUser);
    }

}
