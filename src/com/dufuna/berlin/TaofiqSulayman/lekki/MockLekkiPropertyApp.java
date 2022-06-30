package com.dufuna.berlin.TaofiqSulayman.lekki;


import com.dufuna.berlin.TaofiqSulayman.lekki.model.LekkiProperty;
import com.dufuna.berlin.TaofiqSulayman.lekki.service.MockLekkiPropertyService;

class MockLekkiPropertyApp {
    public static void main(String[] args) {
        MockLekkiPropertyService lekkiPropertyService = new MockLekkiPropertyService();
        LekkiProperty lekkiProperty1 = new LekkiProperty();
        // Save
        lekkiPropertyService.saveProperty(lekkiProperty1);
        // Get
        LekkiProperty storeLekkiProperty = lekkiPropertyService.getProperty();
    }
}
