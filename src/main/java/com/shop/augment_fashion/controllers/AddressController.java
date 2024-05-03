package com.shop.augment_fashion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shop.augment_fashion.models.AddressModel;
import com.shop.augment_fashion.repositories.AddressRepository;

@RestController
public class AddressController {

    @Autowired
    private AddressRepository address;

    @RequestMapping(value = "/Addresses",method=RequestMethod.GET)
    public List<AddressModel> getUsers(){
        return address.getAddresses();
    }

}
