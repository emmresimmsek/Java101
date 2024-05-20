package Siniflar.w3resource.Question02;

public class Dog {

    private String name;
    private String breed;

    //Constructor
    public Dog(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Getter


    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }
}


