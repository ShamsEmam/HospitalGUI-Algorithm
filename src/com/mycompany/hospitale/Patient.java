package com.mycompany.hospitale;

public class Patient implements Comparable<Patient> {

    public String Id, Name, Tele;
    public int Age;

    public Patient(String id, String name, String tele, int age) {
        this.Id = id;
        this.Name = name;
        this.Tele = tele;
        this.Age = age;
    }

    @Override
    public int compareTo(Patient p) {
        return this.Id.compareTo(p.Id);
    }
}
