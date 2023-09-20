package co.edu.uptc.model;

import java.util.ArrayList;

public class Headquarter {

    private String name;
    private ArrayList<String> campus;

    public Headquarter() {
    }

    public Headquarter(String name, ArrayList<String> campus) {
        this.name = name;
        this.campus = campus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getCampus() {
        return campus;
    }

    public void setCampus(ArrayList<String> campus) {
        this.campus = campus;
    }
}
