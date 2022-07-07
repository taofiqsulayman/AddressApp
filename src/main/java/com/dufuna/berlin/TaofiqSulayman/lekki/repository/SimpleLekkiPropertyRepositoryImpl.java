package com.dufuna.berlin.TaofiqSulayman.lekki.repository;

import com.dufuna.berlin.TaofiqSulayman.lekki.model.LekkiProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleLekkiPropertyRepositoryImpl implements SimpleLekkiPropertyRepository {
    public Map<Integer, LekkiProperty> properties = new HashMap<>();

    @Override
    public LekkiProperty save(LekkiProperty lekkiProperty) {
        properties.put(lekkiProperty.getPropertyId(), lekkiProperty);
        return lekkiProperty;
    }

    public LekkiProperty findById(int propertyId) {
        return properties.get(propertyId);
    }
    public List<LekkiProperty> findAll()  {
        return (List<LekkiProperty>) new ArrayList<LekkiProperty>(properties.values());
    }
    public void update(int propertyId, LekkiProperty lekkiProperty) {
        for (Map.Entry<Integer, LekkiProperty> property :
                properties.entrySet()) {
            if (property.getKey() == propertyId){
                properties.put(propertyId, lekkiProperty);
            }
        }
    }
}