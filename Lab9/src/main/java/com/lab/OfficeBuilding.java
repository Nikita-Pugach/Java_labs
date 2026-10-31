package com.lab;

public class OfficeBuilding extends Building {
    private int companies;

    public OfficeBuilding(String address, int floors, double area, int companies) {
        super(address, floors, area);
        this.companies = companies;
    }

    public int getCompanies() { return companies; }
    public void setCompanies(int companies) { this.companies = companies; }

    @Override
    public String getPurpose() {
        return "Офисное здание";
    }

    @Override
    public int calculateCapacity() {
        return companies * 10;
    }
}