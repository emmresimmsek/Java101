package Siniflar.w3resource.Question02;

public class Main {
    public static void main(String[] args) {


    //Write a Java program to create a class called "Dog" with a name and breed attribute.
    //Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.
    Dog dog1 = new Dog("Kangal","Fırtına");
    Dog dog2 = new Dog("Doberman", "Bölük");

        System.out.println(dog1.getName() + " " + dog1.getBreed());
        System.out.println(dog2.getName()+ " " + dog2.getBreed());

        System.out.println("----- Setter metodu ile özellikleri değiştiriyoruz.------");

        dog1.setName("Miço");
        dog2.setName("Kont");

        System.out.println("----- Yaptığım değişiklikleri yazdırıyoruz. -----");
        System.out.println(dog1.getName());
        System.out.println(dog2.getName());



    }
}
