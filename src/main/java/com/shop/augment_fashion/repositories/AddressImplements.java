package com.shop.augment_fashion.repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.json.JSONObject;
import org.springframework.stereotype.Repository;

import com.shop.augment_fashion.models.AddressModel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AddressImplements implements AddressRepository {

    @PersistenceContext
    EntityManager entityManager;

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public List<AddressModel> getAddresses(){
        String query = "FROM AddressModel";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    @Transactional
    public AddressModel getAddress(int nid_address){
        AddressModel address = entityManager.find(AddressModel.class, nid_address);
        return address;
    }

    @Override
    @Transactional
    public void delAddress(int nid_address){
        AddressModel address = entityManager.find(AddressModel.class, nid_address);
        address.setBenable(false);
        address.setDcancellation_date(LocalDateTime.now());
        entityManager.merge(address);
    }

    @Override
    @Transactional
    public void newAddress(String newAddress){
        JSONObject json = new JSONObject(newAddress);
        AddressModel address = new AddressModel();
        address.setCstreet(json.getString("cstreet"));
        address.setCoutdoor_number(json.getString("coutdoor_number"));
        address.setCinterior_number(json.getString("cinterior_numuber"));
        address.setCcologne(json.getString("ccologne"));
        address.setCtown_hall(json.getString("ctown_hall"));
        address.setCstate(json.getString("cstate"));
        address.setCcountry(json.getString("ccountry"));
        address.setBenable(true);

        entityManager.merge(address);
    }

    @Override
    @Transactional
    public void updAddress(String updaAddress){
        JSONObject json = new JSONObject(updaAddress);
        AddressModel  addressOld = entityManager.find(AddressModel.class, json.getInt("nid_user"));
        addressOld.setCstreet(json.getString("cstreet"));
        addressOld.setCoutdoor_number(json.getString("coutdoor_number"));
        addressOld.setCinterior_number(json.getString("cinterior_numuber"));
        addressOld.setCcologne(json.getString("ccologne"));
        addressOld.setCtown_hall(json.getString("ctown_hall"));
        addressOld.setCstate(json.getString("cstate"));
        addressOld.setCcountry(json.getString("ccountry"));
        addressOld.setBenable(true);

        entityManager.merge(addressOld);
    }
}
