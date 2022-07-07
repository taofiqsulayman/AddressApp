package com.dufuna.berlin.TaofiqSulayman.lekki.model;


public class LekkiProperty {
    private int propertyId;
    private int bedroomNum;
    private int sittingRoomNum;
    private int kitchenNum;
    private int bathroomNum;
    private int toiletNum;
    private String propertyOwner;
    private String description;
    private String propertyAddress;
    private String propertyType;
    private long validFrom; // getting time and date in milliseconds since the UNIX Epoch
    private long validTo;

    public LekkiProperty(int propertyId, String propertyAddress, String propertyType) {
        this.propertyId = propertyId;
        this.propertyAddress = propertyAddress;
        this.propertyType = propertyType;
    }

    public LekkiProperty() {

    }


    public int getPropertyId() {
        return propertyId;
    }
    public void setPropertyId(int id) {
        this.propertyId = id;
    }
    public String getPropertyAddress() {
        return propertyAddress;
    }
    public void setPropertyAddress(String address) {
        this.propertyAddress = address;
    }
    public String getPropertyType() {
        return propertyType;
    }
    public void setPropertyType(String type) {
        this.propertyType = type;
    }
    public int getBedroomNum() {
        return bedroomNum;
    }
    public void setBedroomNum(int rooms) {
        this.bedroomNum = rooms;
    }
    public int getSittingRoomNum() {
        return sittingRoomNum;
    }
    public void setSittingRoomNum(int sittingRooms) {
        this.sittingRoomNum = sittingRooms;
    }
    public int getKitchenNum() {
        return kitchenNum;
    }
    public void setKitchenNum(int kitchens) {
        this.kitchenNum = kitchens;
    }
    public int getBathroomNum() {
        return bathroomNum;
    }
    public void setBathroomNum(int bathrooms) {
        this.bathroomNum = bathrooms;
    }
    public int getToiletNum() {
        return toiletNum;
    }
    public void setToiletNum(int toilets) {
        this.toiletNum = toilets;
    }
    public String getPropertyOwner() {
        return propertyOwner;
    }
    public void setPropertyOwner(String owner) {
        this.propertyOwner = owner;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public long getValidFrom() {
        return validFrom;
    }
    public void setValidFrom(long startDate) {
        this.validFrom = startDate;
    }
    public long getValidTo() {
        return validTo;
    }
    public void setValidTo(long endDate) {
        this.validTo = endDate;
    }


    @Override
    public String toString() {
        return "LekkiProperty{" +
                "propertyId=" + propertyId +
                ", propertyAddress='" + propertyAddress + '\'' +
                ", propertyType='" + propertyType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;
        LekkiProperty otherLekkiProperty = (LekkiProperty) otherObject;
        return propertyId == otherLekkiProperty.propertyId;
    }

    @Override
    public int hashCode() {
        return propertyId;
    }
}

