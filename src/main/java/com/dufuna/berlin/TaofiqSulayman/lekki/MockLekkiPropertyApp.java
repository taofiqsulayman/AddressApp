package com.dufuna.berlin.TaofiqSulayman.lekki;


import com.dufuna.berlin.TaofiqSulayman.lekki.service.LekkiPropertyService;
import com.dufuna.berlin.TaofiqSulayman.lekki.service.MockLekkiPropertyService;
import com.dufuna.berlin.TaofiqSulayman.lekki.model.LekkiProperty;

class MockLekkiPropertyApp {
    String[] propertyAddress = { "Phase 1","Osapa","Phase 2", "Chevron"};
    String[] propertyType = { "Duplex","Bungalow", "Storey"};
    LekkiPropertyService service = new MockLekkiPropertyService();

    public static void main(String[] args) {
        String[] propertyAddress = { "Phase 1","Osapa", "Chevron"};
        String[] propertyType = { "Duplex","Bungalow", "Storey"};
        LekkiPropertyService service = new MockLekkiPropertyService();

        for (int i = 0; i < propertyAddress.length; i++) {
            LekkiProperty property = new LekkiProperty( i, propertyAddress[i], propertyType[i]);
            service.saveProperty(property);
            System.out.println(service.getProperty(i));
        }
        System.out.println(service.getProperties());
    }
}
