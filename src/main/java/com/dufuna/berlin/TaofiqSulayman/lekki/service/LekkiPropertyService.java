package com.dufuna.berlin.TaofiqSulayman.lekki.service;


import com.dufuna.berlin.TaofiqSulayman.lekki.model.LekkiProperty;

import java.util.List;

public interface LekkiPropertyService {
    void saveProperty(LekkiProperty LekkiProperty);
    public LekkiProperty getProperty(int propertyId);
    List<LekkiProperty> getProperties();
}


