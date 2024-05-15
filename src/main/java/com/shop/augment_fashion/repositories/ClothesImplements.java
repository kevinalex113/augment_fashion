package com.shop.augment_fashion.repositories;

import java.util.List;

import org.json.JSONException;
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
    @SuppressWarnings("unchecked")
    public JSONObject addClothes(JSONObject newClothes, JSONObject jsonResponse){
        try{
            if(!newClothes.toString().contains("cdescription") || !newClothes.toString().contains("cmaterial") || !newClothes.toString().contains("ccolor") || !newClothes.toString().contains("ctype_clothes") || !newClothes.toString().contains("csize") || !newClothes.toString().contains("fprice") || !newClothes.toString().contains("nstock") ) {
                jsonResponse.put("codeClothes", 401);
                jsonResponse.put("messageUser","[ClothesImplement] some name within the JSON is not valid");
            }else{
                String queryClothes = "FROM ClothesModel WHERE "+
                "cdescription = '" + newClothes.getString("cdescription") +
                "' AND cmaterial = '"+ newClothes.getString("cmaterial") +
                "' AND ccolor = '" + newClothes.getString("ccolor") +
                "' AND ctype_clothes = '" + newClothes.getString("ctype_clothes") +
                "' AND csize = '"+ newClothes.getString("csize") +
                "' AND fprice = " + newClothes.getFloat("fprice") +
                " AND nstock = " + newClothes.getInt("nstock") + 
                " AND benable = True";

                List<ClothesModel> lstClothes = entityManager.createQuery(queryClothes).getResultList();

                if(lstClothes.isEmpty()){
                    
                }else{

                }
                

            }
        }catch(JSONException e){

        }catch(Exception e){

        }

        return null;
    }
}