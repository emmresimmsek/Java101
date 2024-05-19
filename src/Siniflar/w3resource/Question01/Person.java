package Siniflar.w3resource.Question01;

// Write a Java program to create a class called "Person" with a name and age attribute.
// Create two instances of the "Person" class, set their attributes using the constructor,
// and print their name and age.

public class Person {
    // Ad özniteliği
    private String name;
    // Yaş özniteliği
    int age;


    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }



}
