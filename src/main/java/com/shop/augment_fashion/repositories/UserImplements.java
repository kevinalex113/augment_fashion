package com.shop.augment_fashion.repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.json.JSONObject;
import org.springframework.stereotype.Repository;

import com.shop.augment_fashion.models.UserModel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

/**
 *
 * @author EduardoBautista
 */
@Repository
@Transactional
public class UserImplements implements UserRepository{

    @PersistenceContext
    EntityManager entityManager;

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public List<UserModel> getUsers(){
        String query = "FROM UserModel";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    @Transactional
    public UserModel getUser(int nid_user){
        UserModel user = entityManager.find(UserModel.class, nid_user);
        return user;
    }

    @Override
    @Transactional
    public void delUser(int nid_user){
        UserModel user = entityManager.find(UserModel.class, nid_user);
        user.setBenable(false);
        user.setDcancellation_date(LocalDateTime.now());
        entityManager.merge(user);
    }

    @Override
    @Transactional
    public void newUser(JSONObject newUser, int nid_address){
        UserModel userM = new UserModel();
        userM.setCfirst_name(newUser.getString("cfirst_names"));
        userM.setCsurnames(newUser.getString("csurnames"));
        userM.setCnickname(newUser.getString("cnickname"));
        userM.setCemail(newUser.getString("cemail"));
        userM.setCpassword(newUser.getString("cpassword"));
        userM.setNrole(2);
        userM.setNid_Address(nid_address);
        userM.setCnumber_credit_card(newUser.getString("cnumber_credit_card"));
        userM.setBenable(true);

        entityManager.merge(userM);
    }

    @Override
    @Transactional
    public void updUser(String updaUser){
        JSONObject json = new JSONObject(updaUser);
        UserModel userOld = entityManager.find(UserModel.class, json.getInt("nid_user"));
        userOld.setCfirst_name(json.getString("cfirst_name"));
        userOld.setCsurnames(json.getString("csurnames"));
        userOld.setCnickname(json.getString("cnickname"));
        userOld.setCemail(json.getString("cemail"));
        userOld.setCpassword(json.getString("cpassword"));
        userOld.setNrole(json.getInt("nrole"));
        userOld.setNid_Address(json.getInt("nid_Address"));
        userOld.setCnumber_credit_card(json.getString("cnumber_credit_card"));
        userOld.setBenable(json.getBoolean("benable"));

        entityManager.merge(userOld);
    }

}
