package com.shop.augment_fashion.repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.json.JSONException;
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
    private EntityManager entityManager;

    private JSONObject jsonResponse;

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

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public JSONObject newAddress(JSONObject newAddress){
        jsonResponse=new JSONObject();
        try{
            String query = "FROM AddressModel WHERE "
            +"cstreet = '"+ newAddress.getString("cstreet")
            +"' AND coutdoor_number = '" + newAddress.getString("coutdoor_number")
            +"' AND cinterior_number = '" + newAddress.getString("cinterior_number")
            +"' AND ccologne = '" + newAddress.getString("ccologne")
            +"' AND ctown_hall = '" + newAddress.getString("ctown_hall")
            +"' AND cstate = '"+ newAddress.getString("cstate")
            +"' AND ccountry = '" + newAddress.getString("ccountry")
            +"' AND benable = True ";

            List<AddressModel> lstAddress = entityManager.createQuery(query).getResultList();

            if(lstAddress.isEmpty()){
                AddressModel address = new AddressModel();
                address.setCstreet(newAddress.getString("cstreet"));
                address.setCoutdoor_number(newAddress.getString("coutdoor_number"));
                address.setCinterior_number(newAddress.getString("cinterior_number"));
                address.setCcologne(newAddress.getString("ccologne"));
                address.setCtown_hall(newAddress.getString("ctown_hall"));
                address.setCstate(newAddress.getString("cstate"));
                address.setCcountry(newAddress.getString("ccountry"));
                address.setBenable(true);

                entityManager.merge(address);

                query = "FROM AddressModel WHERE "
                +"cstreet = '"+ address.getCstreet()
                +"' AND coutdoor_number = '" + address.getCoutdoor_number()
                +"' AND cinterior_number = '" + address.getCinterior_number()
                +"' AND ccologne = '" + address.getCcologne()
                +"' AND ctown_hall = '" + address.getCtown_hall() 
                +"' AND cstate = '"+address.getCstate()
                +"' AND ccountry = '" + address.getCcountry()
                +"' AND benable = True ";

                lstAddress = entityManager.createQuery(query).getResultList();
                
                jsonResponse.put("code", 200);
                jsonResponse.put("nid_address", lstAddress.get(0).getNid_address());
                jsonResponse.put("message","[AddressImplement] Address Created");
            }else{
                jsonResponse.put("code", 200);
                jsonResponse.put("nid_address", lstAddress.get(0).getNid_address());
                jsonResponse.put("message","[AddressImplement] Address Obtained");
            }
            
            
        }catch(JSONException e){
            jsonResponse.put("code", 400);
            jsonResponse.put("message","[AddressImplement] Invalid syntax for this request was provided");
        }catch(Exception e){
            jsonResponse.put("code", 409);
            jsonResponse.put("message","[AddressImplement] An unexpected error occurred");
        }
        return jsonResponse;
    }

    @Override
    @Transactional
    public void updAddress(String updaAddress){
        JSONObject json = new JSONObject(updaAddress);
        AddressModel  addressOld = entityManager.find(AddressModel.class, json.getInt("nid_user"));
        addressOld.setCstreet(json.getString("cstreet"));
        addressOld.setCoutdoor_number(json.getString("coutdoor_number"));
        addressOld.setCinterior_number(json.getString("cinterior_number"));
        addressOld.setCcologne(json.getString("ccologne"));
        addressOld.setCtown_hall(json.getString("ctown_hall"));
        addressOld.setCstate(json.getString("cstate"));
        addressOld.setCcountry(json.getString("ccountry"));
        addressOld.setBenable(true);

        entityManager.merge(addressOld);
    }
}
