package co.edu.uptc.model;

public class Headquarter {

    private String name;
    private String[] campus;

    public Headquarter() {
    }

    public Headquarter(String name, String[] campus) {
        this.name = name;
        this.campus = campus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getCampus() {
        return campus;
    }

    public void setCampus(String[] campus) {
        this.campus = campus;
    }
}
