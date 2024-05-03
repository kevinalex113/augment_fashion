package com.shop.augment_fashion.repositories;

import java.util.List;

import com.shop.augment_fashion.models.AddressModel;

public interface AddressRepository {
    List<AddressModel> getAddresses();

    AddressModel getAddress(int nid_user);

    void delAddress(int nid_address);

    void newAddress(String newAddress);

    void updAddress(String updaAddress);
}
