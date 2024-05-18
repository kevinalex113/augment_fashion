package com.shop.augment_fashion.repositories;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Repository;

import com.shop.augment_fashion.models.CategoriesModel;
import com.shop.augment_fashion.models.CategoriesModelPK;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

/**
 *
 * @author EduardoBautista
 */
@Repository
@Transactional
public class CategoriesImplements implements CategoriesRepository{
    @PersistenceContext
    EntityManager entityManager;
    
    @Override
    @Transactional
    public JSONObject addCategory(JSONArray lstcategories, int nid_clothes, JSONObject jsonResponse){
        try{
        CategoriesModelPK categoryPK = new CategoriesModelPK();
        CategoriesModel category = new CategoriesModel();
        for(int i = 0; i<lstcategories.length(); i++){
            categoryPK.setNid_clothes(nid_clothes);
            categoryPK.setCcategory(lstcategories.get(i).toString());

            category.setId(categoryPK);
            category.setBenable(true);

            entityManager.merge(category);
        }

    }catch(JSONException e){
        
    }
        return jsonResponse;
    }
}
