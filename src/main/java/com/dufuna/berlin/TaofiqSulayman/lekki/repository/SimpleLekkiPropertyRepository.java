package com.dufuna.berlin.TaofiqSulayman.lekki.repository;

import com.dufuna.berlin.TaofiqSulayman.lekki.model.LekkiProperty;

import java.util.List;

public interface SimpleLekkiPropertyRepository {
    LekkiProperty save(LekkiProperty lekkiProperty);
    LekkiProperty findById(int propertyId);
    List<LekkiProperty> findAll();
    void update(int propertyId, LekkiProperty lekkiProperty);
}



