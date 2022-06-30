package com.dufuna.berlin.TaofiqSulayman.lekki.service;

import com.dufuna.berlin.TaofiqSulayman.lekki.model.LekkiProperty;

public class MockLekkiPropertyService implements LekkiPropertyService {
    @Override
    public void saveProperty(LekkiProperty property) {
        System.out.println("MockLekkiPropertyService" + "." + "saveProperty");
    }

    @Override
    public LekkiProperty getProperty() {
        System.out.println("MockLekkiPropertyService" + "." + "getProperty");
        return new LekkiProperty();
    }
}

