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
                jsonResponse.put("messageClothes","[ClothesImplement] some name within the JSON is not valid");
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
                    ClothesModel clothes = new ClothesModel();
                    clothes.setCdescription(newClothes.getString("cdescription"));
                    clothes.setCmaterial(newClothes.getString("cmaterial"));
                    clothes.setCcolor(newClothes.getString("ccolor"));
                    clothes.setCtype_clothes(newClothes.getString("ctype_clothes"));
                    clothes.setCsize(newClothes.getString("csize"));
                    clothes.setFprice(newClothes.getFloat("fprice"));
                    clothes.setNstock(newClothes.getInt("nstock"));

                    entityManager.merge(clothes);
                    jsonResponse.put("codeClothes", 200);
                    jsonResponse.put("messageClothes","[ClothesImplement] Succesful clothes created");
                }else{
                    jsonResponse.put("codeClothes", 200);
                    jsonResponse.put("messageClothes","[ClothesImplement] Succesful clothes obtained");
                }
            }
        }catch(JSONException e){
            jsonResponse.put("codeClothes", 401);
            jsonResponse.put("messageClothes","[ClothesImplement] JSONException error in JSON");
        }catch(Exception e){
            jsonResponse.put("codeClothes", 401);
            jsonResponse.put("messageClothes","[ClothecvsImplement] Exception unexpected error");
        }

        return jsonResponse;
    }
}