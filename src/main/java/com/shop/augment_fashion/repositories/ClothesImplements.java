package com.shop.augment_fashion.repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.json.JSONObject;
import org.springframework.stereotype.Repository;

import com.shop.augment_fashion.models.ClothesModel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

/**
 *
 * @author EduardoBautista
 */
@Repository
@Transactional
public class ClothesImplements implements ClothesRepository{
    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public JSONObject addClothes(JSONObject newClothes, JSONObject jsonResponse){
        try{
            if(!newClothes.toString().contains("cdescription") || !newClothes.toString().contains("cmaterial") || !newClothes.toString().contains("ccolor") || !newClothes.toString().contains("ctype_clothes") || !newClothes.toString().contains("csize") || !newClothes.toString().contains("fprice") || !newClothes.toString().contains("nstock") ) {
                jsonResponse.put("codeClothes", 401);
                jsonResponse.put("messageUser","[ClothesImplement] some name within the JSON is not valid");
            }else{
                String queryClothes = "FROM ClothesModel WHERE "+
                "cdescription = '" + newUser.getString("cdescription") +
                "' AND cmaterial = '"+ newUser.getString("cmaterial") +
                "' AND ccolor = '" + newUser.getString("ccolor") +
                "' AND ctype_clothes = '" + newUser.getString("ctype_clothes")+
                "' AND csize = '"+ newUser.getString("csize")+
                "' AND fprice = " newUser.getFloat("fprice")+
                " AND nstock = " + newUser.getInt("nstock") + 
                " AND benable = True";

                lst

            }
        }catch(JSONException e){

        }catch(Exception e){

        }
    }
}