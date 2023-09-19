package co.edu.uptc.model;

public class Author {

    private String name;
    private String lastName;
    private String bio;

    public Author() {
    }

    public Author(String name, String lastName, String bio) {
        this.name = name;
        this.lastName = lastName;
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
