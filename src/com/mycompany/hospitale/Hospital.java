package com.mycompany.hospitale;

public class Hospital implements Comparable<Hospital> {
    public String Name, Location;

    public Hospital(String name, String location) {
        this.Name = name;
        this.Location = location;
    }

    @Override
    public int compareTo(Hospital otherHospital) {
        return this.Name.compareTo(otherHospital.Name);
    }
}
