package com.mycompany.hospitale;

public class Doctor implements Comparable<Doctor> {

    public String Id, Name, Tele, Specialization;

    public Doctor(String id, String name, String tele, String specialization) {
        this.Id = id;
        this.Name = name;
        this.Tele = tele;
        this.Specialization = specialization;
    }

    @Override
    public int compareTo(Doctor d) {
        return this.Id.compareTo(d.Id);
    }
}
