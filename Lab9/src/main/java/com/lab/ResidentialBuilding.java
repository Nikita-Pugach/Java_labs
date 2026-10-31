package com.lab;

public class ResidentialBuilding extends Building {
    private int apartments;

    public ResidentialBuilding(String address, int floors, double area, int apartments) {
        super(address, floors, area);
        this.apartments = apartments;
    }

    public int getApartments() { return apartments; }
    public void setApartments(int apartments) { this.apartments = apartments; }

    @Override
    public String getPurpose() {
        return "Жилой дом";
    }

    @Override
    public int calculateCapacity() {
        return apartments * 3;
    }
}